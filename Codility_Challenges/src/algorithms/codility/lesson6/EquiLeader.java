package algorithms.codility.lesson6;

public class EquiLeader {

	public static int solution(int[] A) {
		int len = A.length;
		if (len <= 0) {
			return 0;
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
		
		// Make sure that the leader's value occurs more than half of indices in the array
		counter = 0;
		for (int i = 0; i < len; i++) {
			if (A[i] == leader) {
				counter++;
			}
		}
		if (counter <= len / 2) {
			return 0;
		}

		/* Second find the equi-leader */
		int equiLeader = 0;
		int rightCounter = 0;
		for (int i = 0; i < len; i++) {
			if (A[i] == leader) {
				rightCounter++;
			}
			// Check the existence of the leader in each side.
			if(rightCounter > (i + 1) / 2 && (counter - rightCounter) > (len - i - 1) / 2 ){
				equiLeader++;
			}
		}
		
		return equiLeader;
	}
}
