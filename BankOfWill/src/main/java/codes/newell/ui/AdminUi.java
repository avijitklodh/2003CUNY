package codes.newell.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import codes.newell.entities.Account;
import codes.newell.entities.User;
import codes.newell.services.AdminService;
import codes.newell.services.AdminServiceImpl;
import codes.newell.utilities.UiBuilder;
import codes.newell.utilities.UiPair;

public class AdminUi extends UserUi {

	static AdminService admin = new AdminServiceImpl();
	static {
		menu.add(new UiPair("Admin Actions", AdminUi::adminMenu));
	}

	public static void main() {
		UiBuilder.executeMenu(menu);
	}

	static void adminMenu() {
		List<UiPair> list = new ArrayList<>();
		list.add(new UiPair("View All Users", AdminUi::displayAllUsers));
		list.add(new UiPair("Create User", AdminUi::createUser));
		list.add(new UiPair("Update User", AdminUi::updateUser));
		list.add(new UiPair("Delete User", AdminUi::deleteUser));
		UiBuilder.executeMenu(list);
	}

	static void displayAllUsers() {
		List<User> users = admin.getAllUsers();
		for (User user : users) {
			List<Account> accounts = acc.getAccountsByUserId(user.getId());
			double total = 0;
			for (Account a : accounts) {
				total += a.getBalance();
			}
			System.out.printf("Name: %s Username: %s Total Balance: %.2f\n", user.getName(), user.getUsername(), total);
		}
	}

	static void createUser() {
		User user = new User();
		Scanner input = UiBuilder.getScanner();
		System.out.println("Enter their first and last name");
		String name = input.nextLine();
		user.setName(name);

		System.out.println("Enter their username");
		String username = input.nextLine();
		user.setUsername(username);

		System.out.println("Enter their password");
		String password = input.nextLine();
		user.setPasswordHash(password);

		System.out.println("Is the account an admin? (yes or no)");
		String status = input.nextLine();
		user.setAdminStatus(status.equals("yes") ? true : false);
		admin.createUser(user);
		System.out.println("User has been created; they may now login.");
	}

	static void updateUser() {
		Scanner input = UiBuilder.getScanner();
		System.out.println("Enter the username of the account you wish to edit");
		String oldUsername = input.nextLine();
		User user = admin.getUserByUsername(oldUsername);
		System.out.println("Enter a new first and last name if changed,");
		System.out.println("or press enter to keep the current value");
		String newName = input.nextLine();
		if (newName.length() > 0) {
			user.setName(newName);
		}
		System.out.println("Enter a new username if changed,");
		System.out.println("or press enter to keep the current value");
		String newUsername = input.nextLine();
		if (newUsername.length() > 0) {
			// TODO: validate username uniqueness
			user.setUsername(newUsername);
		}
		System.out.println("Enter a new password if changed,");
		System.out.println("or press enter to keep the current value");
		String newPassword = input.nextLine();
		if (newPassword.length() > 0) {
			user.setPasswordHash(newPassword);
		}
		System.out.println("Make the account an admin? (yes or no)");
		System.out.println("or press enter to keep the current value");
		String newAdminStatus = input.nextLine();
		if (newAdminStatus.equals("yes")) {
			user.setAdminStatus(true);
		} else if (newAdminStatus.equals("yes")) {
			user.setAdminStatus(false);
		}
		admin.updateUser(user);
		System.out.println("User has been updated.");
	}

	static void deleteUser() {
		Scanner input = UiBuilder.getScanner();
		System.out.println("Type the username of the user you wish to delete");
		String username = input.nextLine();
		User selection = admin.getUserByUsername(username);
		admin.deleteUserById(selection.getId());
		System.out.println("User has been deleted");
	}
}
