package algorithms.tree.funtions;

import algorithms.tree.data.MyTreeNode;

public class CheckBalance {

	public static boolean checkTreeBalance(MyTreeNode root){
		int x = maxBranch(root);
		int y =  minBranch(root);
		return (x - y <= 1);
	}
	
	private static int minBranch(MyTreeNode node){
		if(node == null){
			return 0;
		}
		return 1 + Math.min(minBranch(node.getLeft()), minBranch(node.getRight()));
	}
	
	private static int maxBranch(MyTreeNode node){
		if(node == null){
			return 0;
		}
		return 1 + Math.max(maxBranch(node.getLeft()), maxBranch(node.getRight()));
	}
}
