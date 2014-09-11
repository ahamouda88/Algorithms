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
		Stack<Long> fishStack = new Stack<>();
		int countFishes = 0;
		for (int i = 0; i < len; i++) {
			if(B[i] == 0){
				if(fishStack.isEmpty()){
					countFishes++;
				}else{
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
				}
			}else{
				fishStack.push((long) A[i]);
			}			
		}
		return fishStack.size() + countFishes;
	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 1, 5 };
		int[] b = { 0, 1, 0, 0, 0 };
		System.out.println(solution(a, b));
	}
}
