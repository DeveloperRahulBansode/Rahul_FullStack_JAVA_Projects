package com.enumeration.study;

import java.util.Scanner;

public class Menu {
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);

		for (MenuOption menuOption : MenuOption.values()) {

			System.out.println(menuOption.getSrNo() + "." + menuOption.name() + "." + menuOption.getMenuDescreption());
		}

		return scanner.nextInt();
	}

}
