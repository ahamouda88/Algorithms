package algorithms.codility.lesson2;

public class MaxCounters {
	
	/**
	 * A Method to calculate the values of counters after applying all alternating operations.
	 * Increase counter by 1 if element is less than N, Set value of all counters to current maximum if element greater than N 
	 * @param N
	 * @param A
	 * @return
	 */	
    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];        
        int maxCounter = 0;
        int inc = 0;
        
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] <= N){
            	if(result[A[i] - 1] < inc) {
            		result[A[i] - 1] = inc;
            	}           	
                result[A[i] - 1]++;	
                
                if(result[A[i] - 1] > maxCounter){
                    maxCounter = result[A[i] - 1];
                    
                }
            } else if(A[i] == N + 1){
                inc = maxCounter;
            }
        }
        
        for (int i = 0; i < result.length; i++) {
			if(result[i] < inc){
				result[i] = inc;
			}
		}
        
        return result;
    }
}
