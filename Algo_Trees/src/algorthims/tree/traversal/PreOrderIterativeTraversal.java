package algorthims.tree.traversal;

import java.util.Stack;

import algorithms.tree.data.MyTreeNode;

/*
 * Iterative Traversal of tree using PreOrder Algorithm.
 */
public class PreOrderIterativeTraversal {
	
	/*
	 * Printing data of the tree.
	 */
	public static void printTree(MyTreeNode root){
		if(root == null) return;
		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode temp = root;
		stack.add(temp);

		while(!stack.isEmpty()){
			temp = stack.pop();
			System.out.print(" "+temp.getData());
			if(temp.getRight() != null){
				stack.push(temp.getRight());
			}
			
			if(temp.getLeft() != null){
				stack.push(temp.getLeft());
			}
		}
	}
}
