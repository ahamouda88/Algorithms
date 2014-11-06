package algorithms.codility.lesson10;

public class ChocolatesByNumbers {

	/**
	 * There are N chocolates in a circle. Count the number of chocolates you will eat. 
	 * @param N
	 * @param M
	 * @return
	 */
	public static int solution(int N, int M) {
		long gcd = getGCD(N, M);
		long lcm = ((long)N * M) / gcd;
		return (int)(lcm / M);
	}

	// Using Euclidean algorithm to get the Greatest Common Divisor.
	private static long getGCD(int a, int b) {
		if (a % b ==0) {
			return b;
		} else {
			return getGCD(b, a % b);
		}
	}
}
