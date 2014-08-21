package algorithms.codility.lesson4;

import java.util.Arrays;

public class Distinct {

	/**
	 * A Method to compute number of distinct values in an array.
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
		// No elements in the Array
		if (A.length == 0) {
			return 0;
		}
		int counter = 1;

		Arrays.sort(A);

		// Loop to count the number of distinct values
		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] != A[i]) {
				counter++;
			}
		}

		return counter;
	}
}
