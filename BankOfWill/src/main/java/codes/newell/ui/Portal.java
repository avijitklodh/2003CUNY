package codes.newell.ui;

import java.util.ArrayList;
import java.util.List;

import codes.newell.utilities.UiBuilder;
import codes.newell.utilities.UiPair;

public class Portal {

	public static void main(String[] args) {
		System.out.println("Welcome to bank of Will!");

		List<UiPair> menu = new ArrayList<>();
		UiPair option1 = new UiPair("Log In", LogInUi::main);
		UiPair option2 = new UiPair("Create Account", CreateAccountUi::main);
		menu.add(option1);
		menu.add(option2);

		UiBuilder.executeMenu(menu);

	}

}
