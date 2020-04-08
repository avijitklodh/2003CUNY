package codes.newell.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import codes.newell.entities.Account;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.services.AccountService;
import codes.newell.services.AccountServiceImpl;
import codes.newell.services.AdminService;
import codes.newell.services.AdminServiceImpl;
import codes.newell.services.TransactionLog;
import codes.newell.services.TransactionLogImpl;
import codes.newell.utilities.InsufficientFundsException;
import codes.newell.utilities.UiBuilder;
import codes.newell.utilities.UiPair;

public class UserUi {
	static User user;

	static AdminService admin = new AdminServiceImpl();
	static AccountService acc = new AccountServiceImpl();
	static TransactionLog tl = new TransactionLogImpl();

	static List<UiPair> menu = new ArrayList<>();
	static {
		menu.add(new UiPair("Create Bank Account", UserUi::createBankAccount));
		menu.add(new UiPair("Manage Accounts", UserUi::manageAccounts));
		menu.add(new UiPair("View User Transactions", UserUi::listTransactionsByUser));
	}

	public static void main() {
		UiBuilder.executeMenu(menu);
	}

	static void createBankAccount() {
		Scanner s = UiBuilder.getScanner();
		List<Account> accounts = acc.getAccountsByUserId(user.getId());
		Account account = new Account();

		String name;
		boolean nameIsUnique;
		do {
			nameIsUnique = true;
			System.out.println("What is the account nickname?");
			name = s.nextLine();
			for (Account n : accounts) {
				if (n.getNickname().equals(name)) {
					nameIsUnique = false;
					System.out.println("An account with that name already exists.");
				}
			}
		} while (!nameIsUnique);
		System.out.println("What should the initial balance be?");
		double balance = s.nextDouble();
		s.nextLine();
		account.setNickname(name);
		account.setBalance(balance);
		acc.openAccount(user, account);
		System.out.println("Your account has been created.");
	}

	static void manageAccounts() {
		List<UiPair> menu = new ArrayList<>();
		menu.add(new UiPair("View Account Balances", UserUi::displayBalances));
		menu.add(new UiPair("View Transactions by Account", UserUi::listTransactionsByAccount));
		menu.add(new UiPair("Deposit Funds", UserUi::depositFunds));
		menu.add(new UiPair("Withdraw Funds", UserUi::withdrawFunds));
		UiBuilder.executeMenu(menu);
	}

	static void listTransactionsByUser() {
		List<Transaction> log = tl.getTransactionsByUserId(user.getId());
		System.out.printf("|%12s|%12s|%12s|\n", "from", "to", "user");
		System.out.println("________________________________________");
		for (Transaction t : log) {
			UserUi.printTransaction(t);
		}
	}

	static void listTransactionsByAccount() {
		Account account = selectAccount();
		List<Transaction> log = tl.getTransactionsByAccountId(account.getId());
		System.out.println("________________________________________");
		System.out.printf("|%12s|%12s|%12s|\n", "from", "to", "user");
		for (Transaction t : log) {
			UserUi.printTransaction(t);
		}
	}

	static void displayBalances() {
		List<Account> accounts = acc.getAccountsByUserId(user.getId());
		System.out.println("Accounts:");
		for (Account n : accounts) {
			System.out.printf("%-10s $%.2f\n", n.getNickname(), n.getBalance());
		}
	}

	static Account selectAccount() {
		List<Account> accounts = acc.getAccountsByUserId(user.getId());
		Map<String, Account> map = new HashMap<>();
		System.out.println("Write an account name then press enter:");
		for (Account a : accounts) {
			map.put(a.getNickname(), a);
			System.out.printf("%-10s $%.2f\n", a.getNickname(), a.getBalance());
		}
		Scanner input = UiBuilder.getScanner();
		String key = input.nextLine();
		return map.get(key);
	}

	static void depositFunds() {
		Account account = selectAccount();
		System.out.println(account.toString());
		System.out.println("How much would you like to deposit?");
		Scanner input = UiBuilder.getScanner();
		double amount = input.nextDouble();
		input.nextLine();
		Transaction t = new Transaction();
		t.setAmount(amount);
		t.setUser(user.getId());
		System.out.println("Add a transaction message: ");
		t.setMessage(input.nextLine());
		acc.addFunds(account, t);
		System.out.println("Your funds have been added!");
	}

	static void withdrawFunds() {
		Account account = selectAccount();
		System.out.println("How much would you like to withdraw?");
		Scanner input = UiBuilder.getScanner();
		double amount = input.nextDouble();
		input.nextLine();
		Transaction t = new Transaction();
		t.setAmount(amount);
		t.setFromAccount(account.getId());
		t.setToAccount(1);
		t.setUser(user.getId());
		System.out.println("Add a transaction message: ");
		t.setMessage(input.nextLine());
		try {
			acc.withdrawFunds(account, t);
			System.out.println("Your funds have been withdrawn.");
		} catch (InsufficientFundsException e) {
			System.out.println("Could not transact, insufficient funds");
		}
	}

	static void printTransaction(Transaction t) {
		// amount date from, to, submitted by message
		User user = admin.getUserById(t.getUser());
		Account from = acc.getAccountById(t.getFromAccount());
		Account to = acc.getAccountById(t.getToAccount());
		System.out.printf("|%12s|%12s|%12s| on %s\n", from.getNickname(), to.getNickname(), user.getName(),
				t.getDate());
		System.out.printf("Transaction Message: %s\n\n", t.getMessage());
	}
}
