package algorithms.codility.lesson4;

import java.util.Arrays;

public class NumberOfDiscIntersections {
	
	/**
	 * A Method to compute intersections between sequence of discs. 
	 * Time Complexity: O(n2) and Space Complexity: O(1)
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
        int n = A.length;
        int count = 0;
        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int x = Math.max(i,j);
                int y = Math.min(i,j);
                if((x - A[x]) <= (y + A[y])){
                    count++;
                }
            }
        }
        if(count > 10000000){
            return -1;
        }
        return count;
	}
	
	/**
	 * A Method to compute intersections between sequence of discs. 
	 * Time Complexity: O(n*log(n)) and Space Complexity: O(n)
	 * @param A
	 * @return
	 */
	public static int optimal_solution(int[] A) {
        int n = A.length;
        long count = 0;
        long[] x = new long[n];
        long[] y = new long[n];
        
        for (int i = 0; i < n; i++) {
			x[i] = i + A[i];
			y[i] = i - A[i];
		}
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        int j = 0;
        int i = 0;
        while (i < n) {
        	while( j < n && x[i] >= y[j]){
        		j++;
        	}
        	count += j - i - 1;
        	
        	if(count > 10000000){
                return -1;
            }
        	i++;
		}
        
        return (int)count;
	}
}