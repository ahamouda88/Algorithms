package algorithms.codility.lesson6;

public class Dominator {

	/**
	 * A Method to find an index of an array such that its value occurs at more than half of indices in the array.
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
		int len = A.length;
		if (len <= 0) {
			return 0;
		}
		int leader = A[0];
		int counter = 0;
		/* Find the Leader */
		for (int i = 1; i < len; i++) {
			if (A[i] == leader)
				counter++;
			else
				counter--;

			if (counter == 0) {
				leader = A[i];
				counter++;
			}
		}
		counter = 0;
		int lastIndex = -1;
		/*
		 * Check that the value of the leader occurs more than half of values in the array
		 */
		for (int i = 0; i < len; i++) {
			if (A[i] == leader) {
				counter++;
				lastIndex = i;
			}
		}
		if (counter <= len / 2) {
			return -1;
		}
		return lastIndex;
	}
}
