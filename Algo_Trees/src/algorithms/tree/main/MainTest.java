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

		System.out.println("Is Tree Balanced?: " + CheckBalance.checkTreeBalance(root));
		
		Member m1 = new Member("A","A@gmail.com");
		  Member m2 = new Member("B1","B1@gmail.com");
		  Member m3 = new Member("C1","C1@gmail.com");
		  Member m4 = new Member("D1", "D1@gmail.com");
		  Member m5 = new Member("E2","E2@gmail.com");
		  Member m6 = new Member("F2", "F2@gmail.com");
		  Member m7 = new Member("G2", "G2@gmail.com");
		  Member m8 = new Member("H2", "H2@gmail.com");
		  Member m9 = new Member("I2", "I2@gmail.com");
		  Member m10 = new Member("J2", "J2@gmail.com");
		  Member m11 = new Member("K2", "K2@gmail.com");
		  Member m12 = new Member("L2", "L2@gmail.com");
		  Member m13 = new Member("M2", "M2gmail.com");
		  Member m14 = new Member("N3", "N3@gmail.com");
		  Member m15 = new Member("O3", "O3@gmail.com");
		  Member m16 = new Member("P3", "P3@gmail.com");
		  Member m17 = new Member("Q3", "Q3@gmail.com");
		  Member m18 = new Member("R3", "R3@gmail.com");
		  
		  // Add friends of M1.
		  m1.AddFriend(m2);
		  m1.AddFriend(m3);
		  m1.AddFriend(m4);
		  
		  // Add m2 firnds
		  m2.AddFriend(m5);
		  m2.AddFriend(m6);
		  m2.AddFriend(m7);
		  
		  // Add m3 friends
		  m3.AddFriend(m8);
		  m3.AddFriend(m9);
		  m3.AddFriend(m10);

		  // Add m4 friends
		  m4.AddFriend(m11);
		  m4.AddFriend(m12);
		  m4.AddFriend(m13);

		  // Add m5 friends
		  m5.AddFriend(m14);
		  m5.AddFriend(m14);
		  m5.AddFriend(m16);

		  // Add m6 friends
		  m6.AddFriend(m17);
		  m6.AddFriend(m18);
		  
		  SocialMedia.printFriends(m1);
		
	}
	
	private static void TreeTraversal(MyTreeNode root){
		
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
	}
}
