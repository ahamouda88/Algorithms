package algorithms.tree.traversal;

import java.util.Stack;

import algorithms.tree.data.MyTreeNode;

/*
 * Iterative Traversal of tree using InOrder Algorithm.
 */
public class InOrderIterativeTraversal {
	
	/*
	 * Printing data of the tree.
	 */
	public static void printTree(MyTreeNode<Integer> root){
		if(root == null) return;
		Stack<MyTreeNode<Integer>> stack = new Stack<>();
		MyTreeNode<Integer> temp = root;
		
//		Approach(1) with O(n2) where n is the number of nodes.
//		======================================================
//		while(temp != null){
//			stack.push(temp);
//			temp = temp.getLeft();
//		}
//		
//		while(!stack.isEmpty()){
//			temp = stack.pop();
//			System.out.print(" "+temp.getData());
//			if(temp.getRight() != null){
//				temp = temp.getRight();
//				while(temp != null){
//					stack.push(temp);
//					temp = temp.getLeft();
//				}
//			}
//		}
		
//		Approach(2) with O(n) where n is the number of nodes.
//		=====================================================
		while(!stack.isEmpty() || temp != null){
			if(temp != null){
				stack.push(temp);
				temp = temp.getLeft();
			}else{
				temp = stack.pop();
				System.out.print(" "+temp.getData());
				temp = temp.getRight();
			}
		}
		
	}

}
