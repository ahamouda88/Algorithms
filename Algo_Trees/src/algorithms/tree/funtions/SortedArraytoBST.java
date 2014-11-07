package algorithms.tree.funtions;

import algorithms.tree.data.MyTreeNode;

public class SortedArraytoBST {
	
	/**
	 * A Method to convert a sorted array of integers to a Binary Search Tree.
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	public static MyTreeNode sortedArrayToBST(int[] array, int start, int end){
		if(start > end){
			return null;
		}
		int mid = (start + end) / 2;
		MyTreeNode node = new MyTreeNode(array[mid]);
		node.setLeft(sortedArrayToBST(array, start, mid - 1));
		node.setRight(sortedArrayToBST(array, mid + 1, end));
		return node;
	}
}
