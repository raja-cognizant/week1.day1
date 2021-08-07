package LearnJava.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum = 0, secNum = 1, sum = 0, range = 8;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 2; i < range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
