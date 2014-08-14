package algorithms.codility.lesson2;

public class MaxCounters {
	
	/**
	 * A Method to calculate the values of counters after applying all alternating operations: 
	 * increase counter by 1; set value of all counters to current maximum. 
	 * @param N
	 * @param A
	 * @return
	 */	
    public int[] solution(int N, int[] A) {
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
