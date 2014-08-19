package algorithms.codility.lesson4;

import java.util.Arrays;

public class Triangle {

	/**
	 * A Method to determine whether a triangle can be built from a given set of edges. 
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		for (int i = 0; i < A.length - 2; i++) {
			if (A[i] + A[i + 1] > A[i + 2])
				return 1;
		}
		return 0;
	}
}
