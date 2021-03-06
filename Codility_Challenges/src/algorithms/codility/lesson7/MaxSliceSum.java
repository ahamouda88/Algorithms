package algorithms.codility.lesson7;

public class MaxSliceSum {

	/**
	 * A Method to find maximum sum of a compact subsequence of array elements. 
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
		int len = A.length;

		if(len <= 0)
			return 0;
		
		int x = A[0];
		int max = A[0];
		for (int i = 1; i < len; i++) {
			x = Math.max(A[i], A[i] + x);
			max = Math.max(x, max);
		}
		return max;
	}

}
