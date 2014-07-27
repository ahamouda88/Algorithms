package algorithms.codility.lesson1;

public class FrogJmp {

	// Method to count the minimal number of jumps from position X to Y.
	public static int solution(int X, int Y, int D) {
		if (X > Y)
			return 0;

		// Number of Jumps is equal to the difference between two position,
		// and divided it by the fixed distance a frog can jump
		double diff = Y - X;
		double numOfJumbs = Math.ceil(diff / D);

		return (int) numOfJumbs;
	}
}
