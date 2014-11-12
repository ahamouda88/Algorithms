package algorithms.codility.lesson10;

public class CommonPrimeDivisors {

	/**
	 * A Method to check whether two numbers have the same prime divisors. 
	 * @param A
	 * @param B
	 * @return
	 */
	public static int solution(int[] A, int[] B) {
		int n = A.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (hasSameDivisors(A[i], B[i])) {
				count++;
			}
		}
		return count;
	}

	private static boolean hasSameDivisors(int a, int b) {
		int gcd = getGCD(a, b);

		int x = 0;
		int y = 0;
		while (x != 1) {
			x = getGCD(a, gcd);
			a = a / x;
		}
		if (a != 1)
			return false;
		while (y != 1) {
			y = getGCD(b, gcd);
			b = b / y;
		}
		if (b != 1)
			return false;
		return true;
	}

	private static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return getGCD(b, a % b);
		}
	}
}
