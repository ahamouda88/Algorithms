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
        long result;
        if(A % K == 0){
            result = ((B - A) / K) + 1;
        } else{
            long start = A + (A % K);
            result = ((B - start) / K) + 1;
        }
        return (int) result; 
    }
}
