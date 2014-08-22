package algorithms.codility.lesson4;

import java.util.Arrays;

public class MaxProductOfThree {

	public static int solution(int[] A) {
		int n = A.length;
		
		if(n < 3)
			return 0;
		
		Arrays.sort(A);
		
		int max = A[n - 1] * A[n - 2] * A[n - 3];
		if (max < A[0] * A[1] * A[n - 1])
			max = A[0] * A[1] * A[n - 1];
		return max;
	}
}
