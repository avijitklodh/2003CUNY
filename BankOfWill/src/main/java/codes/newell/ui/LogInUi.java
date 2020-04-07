package codes.newell.ui;

import java.util.Scanner;

import codes.newell.dao.UserDAO;
import codes.newell.dao.UserDAOdb;
import codes.newell.entities.User;
import codes.newell.utilities.UiBuilder;

public class LogInUi {
	public static void main() {
		Scanner s = UiBuilder.getScanner();
		User user = new User();
		System.out.println("Please enter your username:");
		String username = s.nextLine();

		System.out.println("Please enter your password:");
		String password = s.nextLine();

		user.setUsername(username);
		user.setPasswordHash(password);

		UserDAO udao = new UserDAOdb();
		udao.getUserByUsernameAndPassword(user);
		if (user.getId() > 0) {
			UserUi.user = user;
			if (user.getAdminStatus()) {
				AdminUi.main();
			} else {
				UserUi.main();
			}
		}
	}
}
