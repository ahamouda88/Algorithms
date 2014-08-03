package algorithms.tree.data;

import java.util.List;

public class Graph {
	private List<Vertex<Integer>> vertices;
	
	public boolean addVertex(Vertex<Integer> vertex){
		return getVertices().add(vertex);
	}
	
	public boolean removeVertex(Vertex<Integer> vertex){
		return getVertices().remove(vertex);
	}
	
	public List<Vertex<Integer>> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex<Integer>> vertices) {
		this.vertices = vertices;
	}
	
}
