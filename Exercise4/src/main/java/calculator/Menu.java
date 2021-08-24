package calculator;

public class Menu {
	static Operations operations = new Operations();
	static int operatorChoice = 1;

	public static int getChoice() {

		System.out.println("Please choose your preferred Operator:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("0. Quit");

		return Utilities.getNextInt();
	}

	public static void actions() {
		while (operatorChoice != 0) {
			operatorChoice = getChoice();

			switch (operatorChoice) {
			case 1:
				System.out.println(
						"The answer is: " + Operations.addition(Utilities.getNextDouble(), Utilities.getNextDouble()));
				break;
			case 2:
				System.out.println("The answer is: "
						+ Operations.subtraction(Utilities.getNextDouble(), Utilities.getNextDouble()));
				break;
			case 3:
				System.out.println("The answer is: "
						+ Operations.multiplication(Utilities.getNextDouble(), Utilities.getNextDouble()));
				break;
			case 4:
				System.out.println(
						"The answer is: " + Operations.division(Utilities.getNextDouble(), Utilities.getNextDouble()));
				break;
			default:
				System.out.println("Error, please try again.");
				break;
			case 0:
				System.out.println("Quitting");
				Utilities.scan.close();
				break;
			}

		}

	}

}
