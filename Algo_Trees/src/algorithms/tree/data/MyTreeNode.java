package algorithms.tree.data;

public class MyTreeNode {
	
	private MyTreeNode left;
	private MyTreeNode right;
	private Object data;

	public MyTreeNode(Object value) {
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
