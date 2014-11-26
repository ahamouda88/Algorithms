package algorithms.tree.data;

public class MyTreeNode<T> {
	
	private MyTreeNode<T> left;
	private MyTreeNode<T> right;
	private T data;

	public MyTreeNode(T value) {
		this.data = value;
	}

	public MyTreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(MyTreeNode<T> left) {
		this.left = left;
	}

	public MyTreeNode<T> getRight() {
		return right;
	}

	public void setRight(MyTreeNode<T> right) {
		this.right = right;
	}

	public Object getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
