package algorithms.tree.traversal;

import algorithms.tree.data.MyTreeNode;

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
			System.out.print(" "+root.getData());
			inOrderTraversal(root.getRight());
		}
	}
	
	public static boolean inOrderTraversalFind(MyTreeNode root, Object x){
		boolean check = false;
		if(root != null){
			check = inOrderTraversalFind(root.getLeft(), x);
			if(root.getData() == x){
				check = true;
			}
			if(!check){
				check = inOrderTraversalFind(root.getRight(), x);
			}
			return check;
		}
		return false;
	}
	
	/*
	 * Visit Current Node, Left Node, then Right Node
	 */
	public static void preOrderTraversal(MyTreeNode root){
		if(root != null){
			System.out.print(" "+root.getData());
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
			System.out.print(" "+root.getData());
		}
	}
}
