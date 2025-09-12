import java.util.*;
import java.text.NumberFormat;

public class Mortgage {

	public static void main(String[] args) {

		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;

		Scanner input = new Scanner(System.in);

		System.out.print("Principle: ");
		int principle = input.nextInt();

		System.out.print("Annual Interest Rate: ");
		float annualInterest = input.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

		System.out.print("Period (Years): ");
		int years = input.nextInt();
		int numberOfPayments = years * MONTHS_IN_YEAR;

		double mortgage = principle
		        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
		        / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

		System.out.print("Mortgage: " + mortgageFormatted);


	}

}
