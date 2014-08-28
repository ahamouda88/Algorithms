package algorithms.codility.lesson5;

import java.util.Stack;

public class Stack2 {
    public int solution(String S) {
    	
//    	Stack<Character> stack = new Stack<>();
    	
    	// That means one bracket doesn't have its closing bracket.
    	if(S.length() % 2 != 0 )
    		return 0;
    	
        if(S.isEmpty())
            return 1;
        
        char[] chars = S.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n/2; i++) {
//			stack.push(chars[i]);
        	if(chars[i] == '{' && chars[n - i - 1] == '}')
        		continue;
        	if(chars[i] == '(' && chars[n - i - 1] == ')')
        		continue;
        	if(chars[i] == '[' && chars[n - i - 1] == ']')
        		continue;
        	return 0;
		}
        
        return 1;
    }
}
