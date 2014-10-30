package algorithms.codility.lesson9;

class CountSemiPrime {

	/**
	 * A Method to count the semiprime numbers in the given range [a..b] 
	 * @param N
	 * @param P
	 * @param Q
	 * @return
	 */
	public static int[] solution(int N, int[] P, int[] Q) {
		
		boolean[] sieve = new boolean[N + 1];
		int[] result = new int[P.length];
		
		for (int i = 2; i <= N; i++) {
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

		// Get all semi-prime numbers.
		int[] countsemi = new int[N + 1];
        for(long i=2 ; i <= N; i++){
            if(sieve[(int)i] == true){
                for(long j=i ; j * i <= N; j++){
                    if(sieve[(int)j] == true){
                        countsemi[(int)(i * j)] = 1; 
                    }
                }
            }
        }
        
        // Count semi-prime number at each index.
        for(int i=1 ; i <= N ; i++){
        	countsemi[i] += countsemi[i - 1];
        }
        
        for(int i=0; i < P.length ; i++){
        	result[i] = countsemi[Q[i]] - countsemi[P[i] - 1];
        }
		return result;
	}
	
}
