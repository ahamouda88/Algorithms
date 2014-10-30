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
		int length = N+1;
		boolean[] sieve = new boolean[length];
		int[] result = new int[P.length];
		
		for (int i = 2; i < length; i++) {
			sieve[i] = true;
		}
		
		// Mark all prime numbers.
		int x = 2;
		while (x * x < length) {
			if (sieve[x] == true) {
				int k = x * x;
				while (k < length) {
					sieve[k] = false;
					k += x;
				}
			}
			x++;
		}

		// Get all semi-prime numbers.
		int[] countsemi = new int[N + 1];
        for(int i=2 ; i < length; i++){
            if(sieve[i] == true){
                for(int j=i ; j * i < length; j++){
                    if(sieve[j] == true){
                        countsemi[i * j] = 1; 
                    }
                }
            }
        }
        
        // Count semi-prime number at each index.
        int count = 0;
        for(int i=0 ; i < length ; i++){
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
	
}
