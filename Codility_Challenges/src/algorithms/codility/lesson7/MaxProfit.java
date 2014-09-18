package algorithms.codility.lesson7;

public class MaxProfit {

	/**
	 * A Method to compute the maximum possible earning from a log of stock prices.  
	 * @param A
	 * @return
	 */
	public static int solution(int[] A){
		int len = A.length;
		if(len <= 1){
			return 0;
		}
		int maxProfit = 0;
		int profit = 0;
		int minValue = A[0];
		for (int i = 1; i < len; i++) {
			profit = Math.max(0, A[i] - minValue);
			minValue = Math.min(A[i], minValue);
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}
}
