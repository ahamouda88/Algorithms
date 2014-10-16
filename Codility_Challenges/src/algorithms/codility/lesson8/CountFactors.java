package algorithms.codility.lesson8;

public class CountFactors {
	
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
