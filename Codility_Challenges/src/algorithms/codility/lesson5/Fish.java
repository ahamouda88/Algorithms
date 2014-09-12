package algorithms.codility.lesson5;

import java.util.Stack;

public class Fish {

	/**
	 * N voracious fish are moving along a river. Calculate how many fish are alive. 
	 * @param A an array represents the size of each fish
	 * @param B an array represents the direction of each fish in the river, either 1 or 0
	 * @return number of alive fishes
	 */
	public static int solution(int[] A, int[] B) {
		int len = A.length;
		// Add only fishes following downstream
		Stack<Long> fishStack = new Stack<>();
		// To count survived fishes following upstream
		int countFishes = 0;
		for (int i = 0; i < len; i++) {
			// Add fish to stack if it is following downstream, otherwise check if it will survive.
			if(B[i] == 0){
				while(!fishStack.isEmpty()){
					if (A[i] > fishStack.peek()) {
						fishStack.pop();
					}else{
						break;
					}
				}
				if(fishStack.isEmpty()){
					countFishes++;
				}
			}else{
				fishStack.push((long) A[i]);
			}			
		}
		return fishStack.size() + countFishes;
	}

}
