 package algorithms.codility.lesson9;

public class CountNonDivisibleOptimal {

	/**
	 * A Method to calculate the number of elements of an array 
	 * that are not divisors of each element. 
	 * @param A
	 * @return
	 */
	public static int[] solution(int[] A) {
		int n = A.length;
		int[] count = new int[2 * n + 1];
		// Hint: use map instead of count with size 2*N
		for (int i = 0; i < n; i++) {
			count[A[i]]++;
		}

		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int j = 2;
			int nonDivisors = n;
			while (j * j <= A[i]) {
				if (A[i] % j == 0) {
					nonDivisors -= count[j];
					if ((A[i] / j) != j) {
						nonDivisors -= count[A[i] / j];
					}
				}
				j += 1;
			}
			// Each number is divisible by 1.
			nonDivisors -= count[1];
			
			// Each number is divisible by itself.
			if (A[i] != 1) {
				nonDivisors -= count[A[i]];
			}
			result[i] = nonDivisors;
		}
		return result;
	}
}
