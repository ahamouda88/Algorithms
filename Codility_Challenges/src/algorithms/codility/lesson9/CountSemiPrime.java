package algorithms.codility.lesson9;

import java.util.*;

class CountSemiPrime {

	// Still not working, and need some refactor
	public static int[] solution(int N, int[] P, int[] Q) {
		boolean[] sieve = new boolean[N + 1];
		int[] result = new int[P.length];
		for (int i = 2; i < sieve.length; i++) {
			sieve[i] = true;
		}
		
		// Mark all prime numbers.
		int x = 2;
		while (x * x <= N) {
			if (sieve[x] == true) {
				int k = x * x;
				while (k <= N) {
					sieve[k] = false;
					k += x;
				}
			}
			x++;
		}

		// Get All semi-prime numbers.
		Set<Integer> set = new HashSet<Integer>();
		int[] countsemi = new int[N + 1];
		int count = 0;
		boolean end = false;
		for (int i = 2; i < N + 1; i++) {
			if (sieve[i] == true) {
				for (int j = i; j * i <= N; j++) {
					if (sieve[j] == true) {
						if (i * j <= N) {
							countsemi[i * j] = 1;
							set.add(i * j);
						} else {
							end = true;
							break;
						}
					}
				}
			}
			if (end) {
				break;
			}
		}
		return result;
	}
}
