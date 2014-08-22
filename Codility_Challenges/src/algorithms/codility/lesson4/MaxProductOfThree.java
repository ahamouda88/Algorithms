package algorithms.codility.lesson4;

import java.util.Arrays;

public class MaxProductOfThree {

	/**
	 * A Method to maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R). 
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
		int n = A.length;
		
		if(n < 3)
			return 0;
		
		Arrays.sort(A);
		
		// Maximum product will be either the last three elements
		// Or the first two elements in case of having large negative numbers, with the last element in the array
		int max = A[n - 1] * A[n - 2] * A[n - 3];
		if (max < A[0] * A[1] * A[n - 1])
			max = A[0] * A[1] * A[n - 1];
		return max;
	}
}
