package algorithms.codility.lesson3;

public class CountDiv {
	
	/**
	 * A Method to compute number of integers divisible by K in range [A..B]. 
	 * @param A
	 * @param B
	 * @param K
	 * @return
	 */
	public int solution(int A, int B, int K) {
		long result = 0;
		if(A % K == 0){
			result = ((B - A) / K);
		} else{
			result = (B / K - (A / K + 1));
		}
		return (int) result + 1;
	}
}
