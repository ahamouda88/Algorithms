package algorithms.recursion;

public class EasyRecursionProblems {
	
	public static int count11ValueInArray(int[] array, int i){
		if(i < array.length){
			if(array[i] == 11){
				return count11ValueInArray(array, i + 1) + 1;
			}else{
				return count11ValueInArray(array, i + 1);
			}
		}
		return 0;
	}
}
