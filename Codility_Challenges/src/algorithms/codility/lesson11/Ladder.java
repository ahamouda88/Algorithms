package algorithms.codility.lesson11;

public class Ladder {

	/**
	 * A Method to count the number of different ways of climbing to the top of a ladder. 
	 * @param A
	 * @param B
	 * @return
	 */
	public static int[] solution(int[] A, int[] B) {
		int n = A.length;

		int[] ladder = new int[n + 2];
		int[] result = new int[n];
		ladder[0] = ladder[1] = 1;

		for (int i = 2; i < n + 2; i++) {
			ladder[i] = (ladder[i - 1] + ladder[i - 2]) % (1 << 30);
		}

		for (int i = 0; i < n; i++) {
			result[i] = ladder[A[i]] % (1 << B[i]);
		}
		return result;
	}
}
