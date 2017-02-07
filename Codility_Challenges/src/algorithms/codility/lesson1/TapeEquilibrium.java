package algorithms.codility.lesson1;

public class TapeEquilibrium {

   /**
    * A Method to calculate minimum difference between two arrays.
    * @param A
    * @return
    */
    public int solution(int[] a) {
        int length = a.length;
        int[] sums = new int[length];
        
        sums[0] = a[0];
        for(int i=1 ; i<length ; i++){
            sums[i] = sums[i-1] + a[i]; 
        }
        
        int minDiff = Integer.MAX_VALUE;
        for(int i=1 ;i<length ; i++){
            int end = sums[length - 1] - sums[i-1];
            int diff = Math.abs(sums[i-1] - end);
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
	
}
