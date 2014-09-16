package algorithms.codility.lesson6;

public class EquiLeader {

	public static int solution(int[] A) {
		int len = A.length;
		if (len <= 0) {
			return -1;
		}
		int leader = A[0];
		int counter = 0;
		/* First find the Leader */
		for (int i = 0; i < len; i++) {
			if (A[i] == leader) {
				counter++;
			} else {
				if (counter == 0) {
					leader = A[i];
					counter++;
				} else {
					counter--;
				}
			}
		}
		long sum = 0;
		counter = 0;
		for (int i = 0; i < len; i++) {
			sum += A[i];
			if (A[i] == leader) {
				counter++;
			}
		}
		if (counter <= len / 2) {
			return -1;
		}

		/* Second find the equi-leader */
		int equiLeader = 0;
		for (int i = 0; i < len; i++) {
			if (A[i] == leader) {
				equiLeader--;
			}
			int rightCounter = counter - equiLeader;
			if (equiLeader > (i + 1) / 2 && rightCounter > (len - i - 1) / 2) {
				equiLeader++;
			}
		}
		
		return equiLeader;
	}
}
