package codes.newell.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import codes.newell.entities.Account;
import codes.newell.entities.Transaction;
import codes.newell.entities.User;
import codes.newell.services.AccountService;
import codes.newell.services.AccountServiceImpl;
import codes.newell.services.TransactionLog;
import codes.newell.services.TransactionLogImpl;
import codes.newell.utilities.UiBuilder;
import codes.newell.utilities.UiPair;

public class UserUi {
	static User user;

	static AccountService as = new AccountServiceImpl();
	static TransactionLog tl = new TransactionLogImpl();

	public static void main() {
		List<UiPair> menu = new ArrayList<>();
		UiPair option1 = new UiPair("Create Bank Account", UserUi::createBankAccount);
		UiPair option2 = new UiPair("Manage Accounts", UserUi::manageAccounts);
		UiPair option3 = new UiPair("View User Transactions", UserUi::listTransactionsByUser);
		menu.add(option1);
		menu.add(option2);
		menu.add(option3);

		UiBuilder.executeMenu(menu);
	}

	static void createBankAccount() {
		Scanner s = UiBuilder.getScanner();
		List<Account> accounts = as.getAccountsByUserId(user.getId());
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
		as.openAccount(user, account);
	}

	static void manageAccounts() {
		List<Account> accounts = as.getAccountsByUserId(user.getId());
		for (Account n : accounts) {
			System.out.printf("%s: $%.2f\n", n.getNickname(), n.getBalance());
		}
		// TODO: build account menu
	}

	static void listTransactionsByUser() {
		List<Transaction> log = tl.getTransactionsByUserId(user.getId());
		for (Transaction t : log) {
			System.out.println(t.toString());
		}
	}
}
