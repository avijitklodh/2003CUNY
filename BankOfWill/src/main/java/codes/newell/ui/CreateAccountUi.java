package codes.newell.ui;

import java.util.Scanner;

import codes.newell.entities.User;
import codes.newell.services.AdminService;
import codes.newell.services.AdminServiceImpl;
import codes.newell.utilities.UiBuilder;

public class CreateAccountUi {

	public static void main() {
		User user = new User();
		Scanner input = UiBuilder.getScanner();
		System.out.println("Enter your first and last name");
		String name = input.nextLine();
		user.setName(name);

		System.out.println("Enter your username");
		String username = input.nextLine();
		user.setUsername(username);

		System.out.println("Enter your password");
		String password = input.nextLine();
		user.setPasswordHash(password);

		AdminService as = new AdminServiceImpl();
		as.createUser(user);
		System.out.println("Your account has been created, you may now log in with your password.");
	}
}
