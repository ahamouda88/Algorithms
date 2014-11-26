package algorithms.tree.funtions;

import algorithms.tree.data.MyTreeNode;

public class LowestCommonAncestor {

	/**
	 * Return the lowest common ancestor between two nodes in a binary tree.
	 * 
	 * @param root
	 * @param node1
	 * @param node2
	 * @return
	 */
	public static MyTreeNode<Integer> LowestCA(MyTreeNode<Integer> root, MyTreeNode<Integer> node1, MyTreeNode<Integer> node2) {
		if (root == null) {
			return null;
		}
		if (root.getData() == node1.getData() || root.getData() == node2.getData()) {
			return root;
		}
		MyTreeNode<Integer> left = LowestCA(root.getLeft(), node1, node2);
		MyTreeNode<Integer> right = LowestCA(root.getRight(), node1, node2);
		if(left != null && right != null){
			return root;
		}
		if(left == null){
			return right;
		}
		return left;
	}

}
