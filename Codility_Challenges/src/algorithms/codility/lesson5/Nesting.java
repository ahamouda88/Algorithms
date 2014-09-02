package algorithms.codility.lesson5;

public class Nesting {
	
	public int solution(String S) {
		if (S.isEmpty())
			return 1;

		// To Count the number of '(' character in String S.
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				count++;
			} else if (S.charAt(i) == ')') {
				if (count > 0)
					count--;
				else
					return 0;
			}
		}
		if (count != 0)
			return 0;

		return 1;
	}
}
