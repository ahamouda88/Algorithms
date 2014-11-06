package algorithms.codility.lesson10;

public class ChocolatesByNumbers {

	
	public int solution(int N, int M) {
		long gcd = getGCD(N, M);
		long lcm = ((long)N * M) / gcd;
		return (int)(lcm / M);
	}

	private long getGCD(int a, int b) {
		if (a % b ==0) {
			return b;
		} else {
			return getGCD(b, a % b);
		}
	}
}
