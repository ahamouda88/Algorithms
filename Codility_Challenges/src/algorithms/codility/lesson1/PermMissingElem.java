package algorithms.codility.lesson1;

public class PermMissingElem {

	/**
	 * A Method to find the missing element in an Array.
	 * @param A
	 * @return
	 */
    public static int solution(int[] A) {
        if(A.length == 0)
            return 1;
        
        // Used long instead of int to work with large numbers.
        long length = A.length + 1;    
        long expectedSum = (length * (length + 1)) / 2; 
       
        long sum = 0;        
        // Loop to get sum of elements in the array.
        for(int i = 0; i < A.length ; i++){
            sum += A[i];
        }

        return (int)(expectedSum - sum);
    }
}
