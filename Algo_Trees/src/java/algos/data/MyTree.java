package java.algos.data;

public class MyTree {
	
	private MyTreeNode root;
	
	public MyTree(MyTreeNode root){
		this.root = root;
	}

	public MyTreeNode getRoot() {
		return root;
	}

	public void setRoot(MyTreeNode root) {
		this.root = root;
	}

	public static class MyTreeNode{
		private MyTreeNode left;
		private MyTreeNode right;
		private Object data;
		
		public MyTreeNode(Object value){
			this.data = value;
		}
		
		public MyTreeNode getLeft() {
			return left;
		}
		public void setLeft(MyTreeNode left) {
			this.left = left;
		}
		
		public MyTreeNode getRight() {
			return right;
		}
		public void setRight(MyTreeNode right) {
			this.right = right;
		}
		
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
	}
	
}
