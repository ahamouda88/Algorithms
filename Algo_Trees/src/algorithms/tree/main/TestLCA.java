package algorithms.tree.main;

import java.util.LinkedList;
import java.util.Queue;

import algorithms.tree.data.MyTreeNode;
import algorithms.tree.funtions.LowestCommonAncestor;

public class TestLCA {

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
	public static void main(String[] args) {
		MyTreeNode<Integer> root = new MyTreeNode<Integer>(4);
		
		root.setLeft(new MyTreeNode<Integer>(3));
		root.getLeft().setLeft(new MyTreeNode<Integer>(20));
		root.getLeft().setRight(new MyTreeNode<Integer>(21));
		root.getLeft().getRight().setLeft(new MyTreeNode<Integer>(7));
		root.getLeft().getRight().setRight(new MyTreeNode<Integer>(8));

		root.setRight(new MyTreeNode<Integer>(1));
		root.getRight().setRight(new MyTreeNode<Integer>(10));
		root.getRight().getRight().setLeft(new MyTreeNode<Integer>(5));
		
		MyTreeNode<Integer> node1 = new MyTreeNode<Integer>(3);
		MyTreeNode<Integer> node2 = new MyTreeNode<Integer>(1);
		printTree(root);
		System.out.println("Lowest Common Ancestor between node "+ node1.getData()+ ", and "+node2.getData() +" is: "+ LowestCommonAncestor.LowestCA(root, node1, node2).getData());
	}
	
	public static void printTree(MyTreeNode<Integer> root){
		Queue<MyTreeNode<Integer>> queue = new LinkedList<>();
		int currentLevel = 1;
		int nextLevel = 0;
		if(root != null){
			queue.add(root);
		}
		while(!queue.isEmpty()){
			MyTreeNode<Integer> temp = queue.remove();
			System.out.print("("+temp.getData()+")");
			if(temp.getLeft() != null){
				queue.add(temp.getLeft());
				nextLevel++;
			}
			if(temp.getRight() != null){
				queue.add(temp.getRight());
				nextLevel++;
			}
			currentLevel--;
			if(currentLevel == 0){
				currentLevel = nextLevel;
				nextLevel = 0;
				System.out.println();
			}
		}
	}

}
