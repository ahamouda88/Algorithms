package algorithms.tree.traversal;

import java.util.Stack;

import algorithms.tree.data.MyTreeNode;

/*
 * Iterative Traversal of tree using PostOrder Algorithm.
 */
public class PostOrderIterativeTraversal {
	
	/*
	 * Printing data of the tree.
	 */
	public static void printTree(MyTreeNode root){
		if(root == null) return;
		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode temp = root;
		stack.add(temp);
		MyTreeNode head = null;

		while (!stack.isEmpty()) {
		   temp = stack.peek();
		    if (temp.getRight() == head || temp.getLeft() == head || (temp.getLeft() == null && temp.getRight() == null)) {
		      stack.pop();
		      System.out.print(" "+temp.getData());
		      head = temp;
		    }
		    else {
		      if (temp.getRight() != null) {
		        stack.push(temp.getRight());
		      }
		      if (temp.getLeft() != null) {
		        stack.push(temp.getLeft());
		      }
		    }
		  }
	}
}
