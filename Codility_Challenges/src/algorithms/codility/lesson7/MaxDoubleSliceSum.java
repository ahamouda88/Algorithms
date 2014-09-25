package algorithms.codility.lesson7;

public class MaxDoubleSliceSum {

	public int solution(int[] A) {
		int len = A.length;
        if(len <= 3){
            return 0;
        }
        int[] x = new int[len];
        int[] y = new int[len];
        
        // Get contiguous subarray of maximum which has the largest sum, starting from the beginning of Array A.
        for(int i = 1; i < len ; i++){
        	x[i] = Math.max(x[i-1] + A[i], 0);
    	}

        // Get contiguous subarray of maximum which has the largest sum, starting from the end of Array A.
        for(int i = len - 2; i > 0 ; i--){
      	  	y[i] = Math.max(A[i-1] + y[i - 1], 0);
      	}
        
        int max = 0;
        for (int i = 0; i < len; i++) {
			
		}
        return 0;
    }
}
