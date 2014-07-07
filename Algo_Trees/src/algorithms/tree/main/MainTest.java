package algorithms.tree.main;

import algorithms.tree.data.MyTreeNode;
import algorthims.tree.traversal.RecursionTraversal;

public class MainTest {

	public static void main(String[] args){
		MyTreeNode root = new MyTreeNode(7);
		
		root.setLeft(new MyTreeNode(3));
		root.getLeft().setLeft(new MyTreeNode(20));
		root.getLeft().setRight(new MyTreeNode(21));
		root.getLeft().getRight().setLeft(new MyTreeNode(7));
		root.getLeft().getRight().setRight(new MyTreeNode(8));

		root.setRight(new MyTreeNode(1));
		root.getRight().setRight(new MyTreeNode(10));
		root.getRight().getRight().setLeft(new MyTreeNode(5));

		RecursionTraversal.inOrderTraversal(root);
	}
}
