package algorithms.codility.lesson3;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
	/**
	 * A Method to find the minimal nucleotide from a range of sequence DNA in time complexity O(N * M).
	 * @param S
	 * @param P
	 * @param Q
	 * @return
	 */
	public static int[] solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        Map<Character, Integer> nucleotides = new HashMap<>();
        nucleotides.put('A',1);
        nucleotides.put('C',2);
        nucleotides.put('G',3);
        nucleotides.put('T',4);
        
        int[] factors = new int[S.length()];
        // Loop to replace nucleotide types with impact factors
        for(int i = 0 ; i < S.length() ; i++){
            factors[i] = nucleotides.get(S.charAt(i));
        }
        
        int min;
        for(int i = 0 ; i < P.length ; i++){
            min = 5;
            for(int j = P[i] ; j <= Q[i] ; j++){
                if(min > factors[j]){
                    min = factors[j];
                }
            }
            result[i] = min;
        }
        return result;
    }
	
	/**
	 * A Method to find the minimal nucleotide from a range of sequence DNA in time complexity O(N + M).
	 * @param S
	 * @param P
	 * @param Q
	 * @return
	 */
	public static int[] optimal_solution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        int[][] factors = new int[S.length()][4];
        
        for(int i = 0; i < S.length(); i++){
             char c = S.charAt(i);
             if(c == 'A') factors[i][0] = 1;
				 if(c == 'C') factors[i][1] = 1;
				 if(c == 'G') factors[i][2] = 1;
				 if(c == 'T') factors[i][3] = 1;
        	}

		// Loop to calculate prefixes
		for(int i = 1; i < S.length() ; i++){
		    for(int j = 0; j < 4; j++){
		        factors[i][j] += factors[i-1][j];
		    }
		}
		
	    for(int i = 0 ; i < P.length ; i++){
	        for(int j = 0 ; j < 4 ; j++){
	            int temp = 0;
	            if(P[i]-1 >= 0) 
	                temp = factors[P[i]-1][j];
	            if(factors[Q[i]][j] - temp > 0){
	                result[i] = j + 1;
	                break;
	            }
	        }    
	    }
	    return result;
	}
}
