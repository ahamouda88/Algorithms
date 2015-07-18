package main.recursion;

public class StringCombination {

	public static void main(String[] args) {
		printStringCombinations("wxyz");
	}
	
	public static void printStringCombinations(String org){
		combine("", org);
	}
	
	private static void combine(String tmp, String org){
		if(tmp.length() >= 1){
			System.out.println(tmp);
		}
		for (int i = 0; i < org.length(); i++) {
			combine(tmp + org.charAt(i), org.substring(i+1));
		}
	}

}
