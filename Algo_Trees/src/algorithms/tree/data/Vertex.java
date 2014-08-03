package algorithms.tree.data;

import java.util.List;

public class Vertex<T> {
	private T data;
	private List<Vertex<T>> neighbors;
	private boolean visited;
	
	public Vertex(T data){
		this.data = data;
		visited = false;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public boolean addNeighbor(Vertex<T> vertex){
		return getNeighbors().add(vertex);
	}
	
	public boolean removeNeighbor(Vertex<T> vertex){
		return getNeighbors().remove(vertex);
	}
	
	public List<Vertex<T>> getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(List<Vertex<T>> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

}
