package algorithms.codility.lesson3;

public class MinAvgTwoSlice {
	
	/**
	 * A Method to find the minimal average of any slice containing at least two elements.
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int length = A.length;
		if(length <= 1){
			return 0;
		}
		
		double avg = Double.MAX_VALUE;
		int start = 0;
		for(int i = 0 ; i < length - 2 ; i++){
		    if((A[i] + A[i + 1]) / 2.0 < avg){
		        avg = (A[i] + A[i + 1]) / 2.0;
		        start = i;
		    }
		    if((A[i] + A[i + 1] + A[i + 2]) / 3.0 < avg){
		        avg = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
		        start = i;
		    }
		}
		// Check the last slice, which includes last two elements.
		if((A[length - 2] + A[length -1]) / 2.0 < avg){
		    avg = (A[length - 2] + A[length -1]) / 2.0;
		    start = length - 2;
		}
		return start;         
    }
}
