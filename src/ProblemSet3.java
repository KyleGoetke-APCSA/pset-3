/*
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
		System.out.print("\nEnter an integer: ");
        long integer = in.nextLong();
		if (integer > 0) {
		    System.out.println("\nPositive.");
		} else {
		    System.out.println("\nNegative.");
		}
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
		System.out.print("\nEnter an integer: ");
        long integer = in.nextLong();
		if (integer % 2 == 0) {
		    System.out.println("\nEven.");
		} else {
		    System.out.println("\nOdd.");
		}
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
		System.out.print("\nEnter three integers.\n");
		System.out.print("\nEnter integer: ");
		long firstInteger = in.nextLong();
		System.out.print("Enter integer: ");
		long secondInteger = in.nextLong();
		System.out.print("Enter integer: ");
		long thirdInteger = in.nextLong();

		boolean equivalent = (firstInteger == secondInteger && secondInteger == thirdInteger);
		boolean strictlyIncreasing = (firstInteger < secondInteger && secondInteger < thirdInteger);
		boolean increasing = (firstInteger <= secondInteger && secondInteger <= thirdInteger);
		boolean strictlyDecreasing = (firstInteger > secondInteger && secondInteger > thirdInteger);
		boolean decreasing = (firstInteger >= secondInteger && secondInteger >= thirdInteger);

		if (equivalent) {
			// Equivalent, where all integers are the same.
			System.out.println("\nEquivalent.");
		} else if (strictlyIncreasing) {
		    // Strictly increasing, where each integer is greater than the previous.
			System.out.println("\nStrictly increasing.");
		} else if (increasing) {
		    // Increasing, where each integer is greater than or equal to the previous.
			System.out.println("\nIncreasing.");
		} else if (strictlyDecreasing) {
			// Strictly decreasing, where each integer is less than the previous.
			System.out.println("\nStrictly decreasing.");
		} else if (decreasing) {
		    // Decreasing, where each integer is less than or equal to the previous.
			System.out.println("\nDecreasing.");
		} else {
		    System.out.println("\nUnordered.");
		}
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
		final double A_VALUE = 4.00;
		final double B_VALUE = 3.00;
		final double C_VALUE = 2.00;
		final double D_VALUE = 1.00;
		final double F_VALUE = 0.00;
		final double PLUS_VALUE = 0.33;
		final double MINUS_VALUE = -0.33;
		double gpa = 0;

		System.out.print("\nEnter a letter grade: ");
		in.nextLine();
		String letterGrade = in.nextLine().toUpperCase();

		if (letterGrade.equals("A") || letterGrade.equals("A+")) {
			gpa += A_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("A-")) {
			gpa += B_VALUE;
			gpa += MINUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("B+")) {
			gpa += B_VALUE;
			gpa += PLUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("B")) {
			gpa += B_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("B-")) {
			gpa += B_VALUE;
			gpa += MINUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("C+")) {
			gpa += C_VALUE;
			gpa += PLUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("C")) {
			gpa += C_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("C-")) {
			gpa += C_VALUE;
			gpa += MINUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("D+")) {
			gpa += D_VALUE;
			gpa += PLUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("D")) {
			gpa += D_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("D-")) {
			gpa += D_VALUE;
			gpa += MINUS_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else if (letterGrade.equals("F")) {
			gpa += F_VALUE;
			System.out.printf("\nYour GPA is %.2f.\n", gpa);
		} else {
			System.out.println("\nThat's not a valid letter grade.");
		}
	}

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
		System.out.print("\nEnter a grade: ");
		double grade = in.nextDouble();

		final boolean aboveInvalid = (grade > 100);
		final boolean belowInvalid = (grade < 0);
		final boolean A = (100 >= grade && grade >= 90);
		final boolean B = (90 > grade && grade >= 80);
		final boolean C = (80 > grade && grade >= 70);
		final boolean D = (70 > grade && grade >= 60);
		final boolean F = (60 > grade && grade >= 0);

		if (aboveInvalid) {
		    // Grade is invalid.
			System.out.println("\nGrades above 100 are invalid.");
		} else if (belowInvalid) {
			// Grade is invalid.
			System.out.println("\nGrades below 0 are invalid.");
		} else if (A) {
		    // Grade is an A
			System.out.println("\nYou recieved an A.");
		} else if (B) {
		    // Grade is a B
			System.out.println("\nYou recieved a B.");
		} else if (C) {
		    // Grade is a C
			System.out.println("\nYou recieved a C.");
		} else if (D) {
		    // Grade is a D
			System.out.println("\nYou recieved a D.");
		} else if (F) {
		    // Grade is an F
			System.out.println("\nYou recieved an F.");
		}
    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
		System.out.print("\nEnter a card: ");
		in.nextLine();
		String cardInput = in.nextLine().toUpperCase();
		String suit = cardInput.substring(1);
		String rank = cardInput.substring(0, 1);
		boolean valid = false;

		switch (rank) {
			case "2":
				rank = "Two";
				valid = true;
				break;
			case "3":
				rank = "Three";
				valid = true;
				break;
			case "4":
				rank = "Four";
				valid = true;
				break;
			case "5":
				rank = "Five";
				valid = true;
				break;
			case "6":
				rank = "Six";
				valid = true;
				break;
			case "7":
				rank = "Seven";
				valid = true;
				break;
			case "8":
				rank = "Eight";
				valid = true;
				break;
			case "9":
				rank = "Nine";
				valid = true;
				break;
			case "T":
				rank = "Ten";
				valid = true;
				break;
			case "J":
				rank = "Jack";
				valid = true;
				break;
			case "Q":
				rank = "Queen";
				valid = true;
				break;
			case "K":
				rank = "King";
				valid = true;
				break;
			case "A":
				rank = "Ace";
				valid = true;
				break;
			default:
				System.out.println("\nThat's not a valid rank.\n");
				valid = false;
		}

		if (valid) {
			switch (suit) {
				case "C":
					suit = "Clubs";
					break;
				case "D":
					suit = "Diamonds";
					break;
				case "H":
					suit = "Hearts";
					break;
				case "S":
					suit = "Spades";
					break;
				default:
					System.out.println("\nThat's not a valid suit.\n");
					valid = false;
			}
		}
		if (valid) {
			System.out.printf("\n%s of %s.\n", rank, suit);
		}
	}

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
		System.out.print("\nEnter a year: ");
		long year = in.nextLong();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("\n" + year + " is a leap year.");
		} else {
			System.out.println("\n" + year + " is not a leap year.");
		}
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
		final int F_FREEZING_POINT = 32;
		final int F_BOILING_POINT = 212;
		final int C_FREEZING_POINT = 0;
		final int C_BOILING_POINT = 100;

		System.out.print("\nEnter a temperature: ");
		double temperature = in.nextDouble();
		System.out.print("Enter a scale: ");
		in.nextLine();
		String tempuratureScale = in.nextLine().toUpperCase();

		if (!(tempuratureScale.equals("C")) && !(tempuratureScale.equals("F"))) {
			System.out.println("\nThat's not a valid scale.");
		}

		if (tempuratureScale.equals("F")) {
			if (temperature >= F_BOILING_POINT) {
				System.out.println("\nGas.");
			} else if (temperature <= F_FREEZING_POINT) {
				System.out.println("\nSolid.");
			} else if (temperature < F_BOILING_POINT && temperature > F_FREEZING_POINT) {
				System.out.println("\nLiquid.");
			}
		}

		if (tempuratureScale.equals("C")) {
			if (temperature >= C_BOILING_POINT) {
				System.out.println("\nGas.");
			} else if (temperature <= C_FREEZING_POINT) {
				System.out.println("\nSolid.");
			} else if (temperature < C_BOILING_POINT && temperature > C_FREEZING_POINT) {
				System.out.println("\nLiquid.");
			}
		}
	}

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
		System.out.print("\nEnter a month: ");
        String month = in.nextLine().toUpperCase();

		switch (month) {
			case "JANUARY":
			case "JANU":
			case "JAN":
				System.out.println("\n31 days.");
				break;
			case "FEBRUARY":
			case "FEBR":
			case "FEB":
				System.out.println("\n28 or 29 days.");
            	break;
			case "MARCH":
			case "MARC":
			case "MAR":
				System.out.println("\n31 days.");
				break;
			case "APRIL":
			case "APRI":
			case "APR":
				System.out.println("\n30 days.");
				break;
			case "MAY":
				System.out.println("\n31 days.");
				break;
			case "JUNE":
			case "JUN":
				System.out.println("\n30 days.");
	            break;
			case "JULY":
			case "JUL":
	            System.out.println("\n31 days.");
	            break;
			case "AUGUST":
			case "AUGU":
			case "AUG":
	            System.out.println("\n31 days.");
	            break;
			case "SEPTEMBER":
			case "SEPT":
			case "SEP":
	            System.out.println("\n30 days.");
	            break;
			case "OCTOBER":
			case "OCTO":
			case "OCT":
	            System.out.println("\n31 days.");
	            break;
			case "NOVEMBER":
			case "NOVE":
			case "NOV":
	            System.out.println("\n30 days.");
	            break;
			case "DECEMBER":
			case "DECE":
			case "DEC":
	            System.out.println("\n31 days.");
	            break;
			default:
	            System.out.println("\nThat's not a valid month.");
	            break;
		}
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

	 public void salary() {
         final double OT_THRESHOLD = 40;
         final double OT_PAY_MULTIPLIER = 1.5;
		 double pay;
         double otHours;

         System.out.print("\nWage: ");
         double wage = in.nextDouble();
         System.out.print("Hours: ");
         double hours = in.nextDouble();

		 if (wage < 0.00) {
             System.out.println("Your wage must be greater than or equal to $0.00/hour.");
         }
         if (hours < 0.0) {
             System.out.println("Your hours must be greater than or equal to 0.0.");
         }

         if (hours > OT_THRESHOLD) {
             otHours = hours - OT_THRESHOLD;
             pay = 40 * wage + otHours * OT_PAY_MULTIPLIER * wage;
             System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
         } else {
             pay = hours * wage;
             System.out.printf("\nYou'll make $%,.2f this week.\n", pay);
         }
     }
}
