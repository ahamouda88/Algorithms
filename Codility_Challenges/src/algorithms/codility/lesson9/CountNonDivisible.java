package algorithms.codility.lesson9;

import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {

	// This Algorithm is Not working!
	public static int[] solution(int[] A) {
		int n = A.length;
		Map<Integer, Integer> map = new HashMap<>();
		// Count number of existence for each element in the array.
		for (int i = 0; i < n; i++) {
			int x = map.get(A[i]) == null ? 1 : map.get(A[i]) + 1;
			map.put(A[i], x);
		}

		int[] result = new int[n];
		// Each number is divisible by itself
		int[] counter = new int[n];
		for (int i = 0; i < n; i++) {
			int one = map.get(A[i]) == 1 ? 0 : 1;
			counter[i] = map.get(A[i]) + one;
		}

		for (int  i= 0; i < n; i++) {
			int j = 2;
			while (j <= Math.sqrt(A[i]) + 1) {
					if (map.get(j) != null && A[i] % j == 0) {
						counter[i] += map.get(j);
					}
				j++;
			}
		}
		return result;
	}

	// For testing!
	public static void main(String[] args) {
		int[] input = new int[] { 3, 1, 2, 3, 6 };
		CountNonDivisible.solution(input);

	}
	
    public int[] solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int length = A.length;
        int[] result = new int[length];
        
        int[] fib = new int[length + 2];
        fib[1] = 1;
        for(int i=2 ; i< length + 2; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for(int i= 0; i < length ; i++){
            result[i] = fib[A[i] + 1] % (1<<B[i]);
        }
        return result;
    }

}
