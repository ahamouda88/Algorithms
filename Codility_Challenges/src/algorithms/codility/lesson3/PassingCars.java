package algorithms.codility.lesson3;

public class PassingCars {
	
	/**
	 * A Method to count the number of passing cars on the road.
	 * @param A
	 * @return
	 */
	public static int solution(int[] A) {
        int length = A.length;
        if(length <= 1)
            return 0;
            
        int east = 0;
        long passingCars = 0;
        for(int i = 0 ; i < length ; i++){
            if(A[i] == 0)
                east++;
            if(A[i] == 1){
                passingCars += east;
            }
        }
        if(passingCars > 1000000000)
            return -1;
        
        return (int) passingCars;
    }
}
