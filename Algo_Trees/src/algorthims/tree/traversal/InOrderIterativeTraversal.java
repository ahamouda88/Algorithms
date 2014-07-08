package algorthims.tree.traversal;

import java.util.Stack;

import algorithms.tree.data.MyTreeNode;

/*
 * Iterative Traversal of tree using InOrder Algorithm.
 */
public class InOrderIterativeTraversal {
	
	/*
	 * Printing data of the tree.
	 */
	public static void printTree(MyTreeNode root){
		if(root == null) return;
		Stack<MyTreeNode> stack = new Stack<>();
		MyTreeNode temp = root;
		while(temp != null){
			stack.push(temp);
			temp = temp.getLeft();
		}
		
		while(!stack.isEmpty()){
			temp = stack.pop();
			System.out.print(" "+temp.getData());
			if(temp.getRight() != null){
				temp = temp.getRight();
				while(temp != null){
					stack.push(temp);
					temp = temp.getLeft();
				}
			}
		}
	}

}
