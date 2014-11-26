package algorithms.tree.main;

import algorithms.tree.data.MyTreeNode;
import algorithms.tree.funtions.CheckBalance;
import algorithms.tree.funtions.SortedArraytoBST;
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
		MyTreeNode<Integer> root = new MyTreeNode<>(4);
	
		root.setLeft(new MyTreeNode<Integer>(3));
		root.getLeft().setLeft(new MyTreeNode<Integer>(20));
		root.getLeft().setRight(new MyTreeNode<Integer>(21));
		root.getLeft().getRight().setLeft(new MyTreeNode<Integer>(7));
		root.getLeft().getRight().setRight(new MyTreeNode<Integer>(8));

		root.setRight(new MyTreeNode<Integer>(1));
		root.getRight().setRight(new MyTreeNode<Integer>(10));
		root.getRight().getRight().setLeft(new MyTreeNode<Integer>(5));

		System.out.println("Is Tree Balanced?: " + CheckBalance.checkTreeBalance(root));
		
		int[] numbers = new int[]{1,2,3,4,5,6};
		MyTreeNode<Integer> node = SortedArraytoBST.sortedArrayToBST(numbers, 1, numbers.length - 1);
		InOrderIterativeTraversal.printTree(node);
	}
	
	@SuppressWarnings("unused")
	private static void TreeTraversal(MyTreeNode<Integer> root){
		
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
		
		calculateSquence("26");
	}
	
	/*
	 * Method to print the first five sequence of a String
	 */
	public static void calculateSquence(String S0){
	    if(S0 == null || S0.length() <= 0 ){
	        return;
	    }
	    StringBuilder tmp;
	    String S1 = S0;
	    for(int i = 0 ; i < 5 ; i++){
	        int count = 1;
	        int j = 0;
	        tmp = new StringBuilder("");
	        for(j = 0 ; j < S1.length() - 1 ; j++){
	            if(S1.charAt(j) == S1.charAt(j+1)){
	                count++;
	            }else{
	                tmp.append(count+""+S1.charAt(j));
	                count = 1;
	            }
	        }
	        
	        tmp.append(count+""+S1.charAt(j));
	        S1 = tmp.toString();
	        System.out.println(tmp.toString());
	    }
	}
	
	/*
	 * Method for dividing numbers without the '/' operator
	 */
	public static int divide(int num, int x){
		if(num - x < 0){
			return 0;
		}
		else{
			return divide(num - x, x) + 1;
		}
	}	
}
