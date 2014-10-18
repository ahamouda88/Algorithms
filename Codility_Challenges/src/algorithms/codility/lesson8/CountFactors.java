package algorithms.codility.lesson8;

public class CountFactors {
	
	/**
	 * A Method to count factors of given number n.
	 * @param N
	 * @return
	 */
	public static int solution(int N){
		int i = 1;

        int counter = 0;
        while(i < Math.sqrt(N)){
            if(N % i == 0){
                counter+=2;
            }
            i++;
        }
        if(i == Math.sqrt(N))
            counter++;
        return counter;
	}

}
