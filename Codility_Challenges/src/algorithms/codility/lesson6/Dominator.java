package algorithms.codility.lesson6;

public class Dominator {

	public static int solution(int[] A){		
		int sum = 0;
        for(int i=0 ; i < A.length ; i++){
            sum+=A[i];
        }
        for(int i=0; i < A.length - 1; i++){
            if(A[i] != A[i+1]){
                sum -= (A[i] + A[i+1]);
                i++;
            }else{
                sum -= A[i];
            }
        }
        int  count = 0;
        for(int i=0; i < A.length; i++){
            if(sum == A[i]){
                count++;
            }
            if(count > A.length / 2)
            return i;
        }
        return -1;
	}
}
