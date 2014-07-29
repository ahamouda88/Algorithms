package algorithms.codility.lesson2;

public class PermCheck {
	
	 // Method to check if array is a permutation    
    public int solution(int[] A) {
        
        int length = A.length;
        boolean[] check = new boolean[length + 1];
        
        for(int i=0 ;  i < length ; i++){
        	// Number is out of boundary, so the array is not a permutation.
            if(A[i] > length)
                return 0;
            else{
                check[A[i]] = true;
            }
        }
        
        for(int i = 1 ; i < check.length ; i++){
            if(check[i] == false)
                return 0;
        }    
        return 1;
    }
}
