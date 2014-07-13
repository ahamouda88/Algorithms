package algorithms.tree.main;

import algorithms.tree.data.MyTreeNode;
import algorithms.tree.funtions.CheckBalance;
import algorithms.tree.traversal.InOrderIterativeTraversal;
import algorithms.tree.traversal.PostOrderIterativeTraversal;
import algorithms.tree.traversal.PreOrderIterativeTraversal;
import algorithms.tree.traversal.RecursionTraversal;

public class MainTest {

	/*				Tree Structure
	 * 				==============
	 *                   (4)
	 *                  /   \
	 *                (3)   (1)
	 *                / \     \
	 *              (20)(21)  (10)
	 *                  / \    /
	 *                (7) (8) (5) 
	 */
	public static void main(String[] args){
		MyTreeNode root = new MyTreeNode(4);
	
		root.setLeft(new MyTreeNode(3));
		root.getLeft().setLeft(new MyTreeNode(20));
		root.getLeft().setRight(new MyTreeNode(21));
		root.getLeft().getRight().setLeft(new MyTreeNode(7));
		root.getLeft().getRight().setRight(new MyTreeNode(8));

		root.setRight(new MyTreeNode(1));
		root.getRight().setRight(new MyTreeNode(10));
		root.getRight().getRight().setLeft(new MyTreeNode(5));

		System.out.println("PreOrder Traversal!" +"\n" +"===================");
		RecursionTraversal.preOrderTraversal(root);
		
		System.out.println("\n");
		System.out.println("PreOrder Traversal Iteratively" +"\n" +"=============================");
		PreOrderIterativeTraversal.printTree(root);
		
		System.out.println("\n");
		System.out.println("PostOrder Traversal!" +"\n" +"====================");
		RecursionTraversal.postOrderTraversal(root);
		
		System.out.println("\n");
		System.out.println("PostOrder Traversal Iteratively" +"\n" +"=============================");
		PostOrderIterativeTraversal.printTree(root);
		
		System.out.println("\n");
		System.out.println("InOrder Traversal!" +"\n" +"===================");
		RecursionTraversal.inOrderTraversal(root);
		
		System.out.println("\n");
		int x = 3;
		System.out.println("InOrder Search For: "+ x +" = "+RecursionTraversal.inOrderTraversalFind(root,x));
		
		System.out.println("\n");
		System.out.println("InOrder Traversal Iteratively" +"\n" +"=============================");
		InOrderIterativeTraversal.printTree(root);
		
		System.out.println("\n");
		System.out.println("Is Tree Balanced?: " + CheckBalance.checkTreeBalance(root));
		
	}
}
