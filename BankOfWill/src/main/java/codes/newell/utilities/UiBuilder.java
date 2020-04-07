package codes.newell.utilities;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UiBuilder {
	private static Scanner scan = new Scanner(System.in);

	public static Scanner getScanner() {
		return scan;
	}

	public static void executeMenu(List<UiPair> list) {
		int selection = 0;
		boolean running = true;

		do {
			System.out.println("Would you like to: ");
			System.out.println("0. Exit Menu");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d. %s\n", i + 1, list.get(i).text);
			}

			try {
				selection = requestSelection();
			} catch (InputMismatchException e) {
				selection = list.size() + 1;
			}

			if (selection == 0) {
				running = false;
			} else if (selection > 0 && selection <= list.size()) {
				list.get(selection - 1).method.callMethod();
			} else {
				System.out.println("Invalid selection, please try again.");
			}
		} while (running);
	}

	static int requestSelection() throws InputMismatchException {
		System.out.printf("Type the number of the command and press enter: ");
		Scanner input = UiBuilder.getScanner();
		try {
			return input.nextInt();
		} catch (InputMismatchException e) {
			throw e;
		} finally {
			input.nextLine();
		}
	}
}
