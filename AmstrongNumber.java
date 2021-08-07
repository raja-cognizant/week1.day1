package LearnJava.day1;

public class AmstrongNumber {

	public static void main(String[] args) {

		int number = 153, reminder, sum = 0, quotient = 1;
		int i = number;
		while (quotient != 0) {
			reminder = i % 10;
			quotient = i / 10;
			i = quotient;
			sum = sum + (reminder * reminder * reminder);

		}
		if (sum == number) {
			System.out.println("The Number is an Amstrong Number");

		} else {
			System.out.println("The number is not an Amstorng Number");
		}
	}

}
