package algorithms.codility.lesson9;

import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {
	
	public static int[] solution(int[] A){
		int n = A.length;
		Map<Integer, Integer> map = new HashMap<>();
		// Count number of existence for each element in the array.
		for (int i = 0; i < n; i++) {
			int x = map.get(A[i]) == null ? 1 : map.get(A[i]) + 1;
			map.put(A[i], x);
		}
		
		// Each number is divisible by itself
		int[] counter = new int[n];
		for (int i = 0; i < n; i++) {
			counter[i] = 1;
		}
		
		// Count number of divisible for each element in the array.
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= Math.ceil(Math.sqrt(A[i])); j++) {
				if(map.get(j) != null && A[i] % j == 0){
					counter[i] += map.get(j);
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		int[] input = new int[]{3,1,2,3,6};
		CountNonDivisible.solution(input);
		
	}

}
