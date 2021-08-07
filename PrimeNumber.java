package LearnJava.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int range = num / 2;
		boolean result = false;
		for (int i = 2; i < range; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a Prime Number");
				result = true;
				break;
			}
		}

		if (result == false) {
			System.out.println(num + " is a Prime Number");
		}

	}

}
