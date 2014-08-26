package algorithms.codility.lesson4;

public class NumberOfDiscIntersections {
	
	/**
	 * A Method to compute intersections between sequence of discs. 
	 * Time Complexity: O(n2)
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

}
