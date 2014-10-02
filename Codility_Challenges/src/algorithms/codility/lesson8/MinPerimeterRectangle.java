package algorithms.codility.lesson8;

public class MinPerimeterRectangle {

	public static int solution(int N) {
		int i = 1;
		int perimeter = 0;
		int min = Integer.MAX_VALUE;
		while (i <= Math.sqrt(N)) {
			if (N % i == 0) {
				perimeter = 2 * (i + N / i);
				if (perimeter < min) {
					min = perimeter;
				}
			}
			i++;
		}
		return min;
	}

}
