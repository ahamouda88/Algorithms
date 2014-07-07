package java.algos.traversal;

import java.algos.data.MyTreeNode;

/*
 * A static class for printing Tree values
 * Recursion Traversal of Tree using different algorithms
 */
public class RecursionTraversal {

	/*
	 * Visit Left Node, Current Node, then Right Node
	 */
	public static void inOrderTraversal(MyTreeNode root){
		if(root != null){
			inOrderTraversal(root.getLeft());
			System.out.println(" "+root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	
	/*
	 * Visit Current Node, Left Node, then Right Node
	 */
	public static void preOrderTraversal(MyTreeNode root){
		if(root != null){
			System.out.println(" "+root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}
	
	/*
	 * Visit Left Node, Right Node, then Current Node
	 */
	public static void postOrderTraversal(MyTreeNode root){
		if(root != null){
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(" "+root.getData());
		}
	}
}
