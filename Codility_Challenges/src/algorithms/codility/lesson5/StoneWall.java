package algorithms.codility.lesson5;

import java.util.Stack;

public class StoneWall {

	/**
	 * A Method to cover "Manhattan skyline" using the minimum number of rectangles. 
	 * @param H
	 * @return
	 */	
	public static int solution(int[] H) {
		Stack<Integer> stack = new Stack<>();
		int counter = 0;
		for (int i = 0 ; i < H.length ; i++) {
			while ( !stack.isEmpty() && stack.peek() > H[i]) {
				stack.pop();
			}
			if (!(!stack.isEmpty() && stack.peek() == H[i])) {
				stack.push(H[i]);
				counter++;
			}
		}
		return counter;
	}

}