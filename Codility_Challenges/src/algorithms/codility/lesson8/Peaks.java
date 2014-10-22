package algorithms.codility.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

	public static int solution(int[] A) {

		int length = A.length;
		List<Integer> peaks = new ArrayList<Integer>();

		for (int i = 1; i < length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1])
				peaks.add(i);
		}

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
