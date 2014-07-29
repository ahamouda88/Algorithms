package algorithms.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
	
	/**
	 * A Method to find the earliest time when a frog can jump to the other side of a river. 
	 * @param X
	 * @param A
	 * @return earliest time to reach X
	 */
	public static int solution(int X, int[] A) {
		if (A.length <= 1)
			return 0;
		
		// A Set to check if leaf exists in all position from 1 to X.
		Set<Integer> set = new HashSet<>();

		// Add the current position of the frog.
		set.add(A[0]);

		for (int i = 1; i < A.length; i++) {
			if (A[i] <= X) {
				set.add(A[i]);
				if (set.size() == X) {
					return i;
				}
			}
		}
		return -1;
	}
}
