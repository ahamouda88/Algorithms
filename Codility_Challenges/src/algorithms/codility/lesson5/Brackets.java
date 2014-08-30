package algorithms.codility.lesson5;

import java.util.Stack;

public class Brackets {
	
	/**
	 * A Method to determine whether a given string of parentheses is properly nested. 
	 * @param S
	 * @return
	 */
	public int solution(String S) {

		Stack<Character> stack = new Stack<>();

		// That means one bracket doesn't have its closing bracket.
		if (S.length() % 2 != 0)
			return 0;

		for (int i = 0; i < S.length(); i++) {
			Character ch = S.charAt(i);
			boolean matchFound = false;
			if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty())
					return 0;
				if (ch == '}' && stack.peek() == '{')
					matchFound = true;
				else if (ch == ']' && stack.peek() == '[')
					matchFound = true;
				else if (ch == ')' && stack.peek() == '(')
					matchFound = true;

				if (matchFound) {
					stack.pop();
				} else {
					return 0;
				}
			}
		}
		if (!stack.isEmpty())
			return 0;

		return 1;
	}
}
