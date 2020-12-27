package findemail;

import java.util.Scanner;

public class EmailFinder {

	public static void main(String[] args) {

		EmailList emailList = new EmailList(20);

		emailList.addEmail("Razzlefrazz@gmail.com");
		emailList.addEmail("Gatsby@yahoo.com");
		emailList.addEmail("snowiscold@gmail.com");
		emailList.addEmail("ilovejava@gmail.com");
		emailList.addEmail("happychristmas@gmail.com");
		emailList.addEmail("barb.sander@gmail.com");
		emailList.addEmail("homer.simpson@gmail.com");
		emailList.addEmail("peter.griffin@gmail.com");
		emailList.addEmail("mac.miller@gmail.com");
		emailList.addEmail("christina.giles@gmail.com");
		emailList.addEmail("evan.spangenberg@gmail.com");
		emailList.addEmail("monkeysee@gmail.com");
		emailList.addEmail("monkeydoo@gmail.com");
		emailList.addEmail("belowzero@gmail.com");
		emailList.addEmail("sky.time@gmail.com");
		emailList.addEmail("red.apples@gmail.com");
		emailList.addEmail("blue.pear@gmail.com");
		emailList.addEmail("happy.feet@gmail.com");

		emailList.printEmails();

		System.out.println("Please provide an email to search for:");

		Scanner scanner = new Scanner(System.in);
		String emailSearch = scanner.nextLine();

		boolean foundMatch = emailList.foundMatch(emailSearch);

		if (foundMatch) {
			System.out.println(emailSearch + " is a valid email");
		} else {
			System.out.println(emailSearch + " is not a valid email");
		}

	}

}
