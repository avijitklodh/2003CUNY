package codes.newell.ui;

import java.util.ArrayList;
import java.util.List;

import codes.newell.utilities.UiBuilder;
import codes.newell.utilities.UiPair;

public class Portal {

	public static void main(String[] args) {
		System.out.println("Welcome to bank of Will!");

		List<UiPair> menu = new ArrayList<>();
		menu.add(new UiPair("Log In", LogInUi::main));
		menu.add(new UiPair("Create Account", CreateAccountUi::main));

		UiBuilder.executeMenu(menu);

	}

}
