package algorthims.tree.traversal;

import java.util.Stack;

import algorithms.tree.data.MyTreeNode;

public class PreOrderIterativeTraversal {
	
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
