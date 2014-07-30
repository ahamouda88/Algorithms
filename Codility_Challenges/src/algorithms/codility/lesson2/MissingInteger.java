package algorithms.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	
	/**
	 * A Method to find the minimal positive integer not occurring in a given sequence. 
	 * @param A
	 * @return
	 */
	public int solution(int[] A) {
		int length = A.length;

		Set<Integer> numbers = new HashSet<>();
		int min = Integer.MAX_VALUE;

		// Get Minimum positive number first.
		for (int i = 0; i < length; i++) {
			if (A[i] >= 1) {
				numbers.add(A[i]);
				if (A[i] < min) {
					min = A[i];
				}
			}
		}

		if (min == Integer.MAX_VALUE || min > 1)
			return 1;
			
		int j;
		for (j = 0; j < numbers.size(); j++) {
			min++;
			if (!numbers.contains(min))
				return min;
		}
		if (min <= 0)
			return 1;
		else if (j == length)
			return min++;
		else
			return 0;
	}
}
