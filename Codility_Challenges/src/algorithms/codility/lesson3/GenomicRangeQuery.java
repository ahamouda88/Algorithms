package algorithms.codility.lesson3;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {
	/**
	 * A Method to find the minimal nucleotide from a range of sequence DNA.
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
}
