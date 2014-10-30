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
		int[] countsemi = new int[N + 1];
        for(int i=2 ; i < N + 1; i++){
            if(sieve[i] == true){
                for(int j=i ; j * i <= N; j++){
                    if(sieve[j] == true){
                        countsemi[i * j] = 1; 
                    }
                }
            }
        }
        
        int count = 0;
        for(int i=0 ; i < N+1 ; i++){
        	count += countsemi[i];
        	countsemi[i] = count;
        }
        
        for(int i=0; i < P.length ; i++){
        	for(int j = P[i] ; j <= Q[i] ; j++){
        		count += countsemi[j];
        	}
        	result[i] = countsemi[Q[i]] - countsemi[P[i] - 1];
        }
		return result;
	}
	
	public static void main(String[] args){
		CountSemiPrime.solution(26, new int[]{4}, new int[]{10});
	}
}
