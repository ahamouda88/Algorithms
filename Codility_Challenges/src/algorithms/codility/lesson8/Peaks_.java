package algorithms.codility.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Peaks_ {

	/**
	 * A Method to Divide an array into the maximum number of same((-))sized blocks, 
	 * each of which should contain an index P such that A[P - 1] < A[P] > A[P + 1].
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {

		int length = A.length;
		List<Integer> peaks = new ArrayList<Integer>();

		// Loop for adding all the peaks to the list.
		for (int i = 1; i < length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1])
				peaks.add(i);
		}

		// Loop to get the number of blocks, results from dividing the Array
		for (int size = 1; size <= length; size++) {
			if (length % size == 0) {
				int x = 0;
				int blocks = length / size;
				boolean check = true;

				for (int peak : peaks) {
					if (peak / size > x) {
						check = false;
						break;
					}
					if (peak / size == x)
						x++;
				}
				if (x != blocks)
					check = false;
				if (check)
					return blocks;
			}
		}
		return 0;

	}
}
