package algorithms.codility.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Flags_ {

	public static int solution(int[] A) {
		
		List<Integer> array = new ArrayList<Integer>();
		
		// Loop for adding all the peaks to the list.
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
				array.add(i);
			}
		}
		
		if (array.size() <= 1) {
			return array.size();
		}
		
		int sf = 1;
		int ef = array.size();
		int result = 1;
		while (sf <= ef) {
			int flag = (sf + ef) / 2;
			boolean suc = false;
			int used = 0;
			int mark = array.get(0);
			for (int i = 0; i < array.size(); i++) {
				if (array.get(i) >= mark) {
					used++;
					mark = array.get(i) + flag;
					if (used == flag) {
						suc = true;
						break;
					}
				}
			}
			if (suc) {
				result = flag;
				sf = flag + 1;
			} else {
				ef = flag - 1;
			}
		}
		return result;
	}

}
