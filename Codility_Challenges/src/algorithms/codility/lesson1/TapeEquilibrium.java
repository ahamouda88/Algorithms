package algorithms.codility.lesson1;

public class TapeEquilibrium {

	/**
	 * A Method to calculate minimum difference between two arrays.
	 * @param A
	 * @return
	 */
    public static int solution(int[] A) {
        if(A.length == 0 || A.length == 1)
            return 0;
    
        int totalSum = 0;
        // Loop to calculate Total Sum of an Array.    
        for(int i = 0 ; i < A.length ; i++){
            totalSum += A[i];
        }
        
        int minDiff = Integer.MAX_VALUE;
        int tempSum = 0;
        for(int i = 0 ; i < A.length -1 ; i++){
            tempSum += A[i];
            totalSum -= A[i];
            if(Math.abs(tempSum - totalSum) < minDiff){
                minDiff = Math.abs(tempSum - totalSum);
            }
        }
        return minDiff;
    }
	
}
