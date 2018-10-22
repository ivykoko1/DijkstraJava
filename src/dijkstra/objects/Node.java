package dijkstra.objects;

import java.util.ArrayList;

public class Node {
	
	private ArrayList<Edge> edges;
	int distance;
	
	public Node() {
		this.edges = new ArrayList<Edge>();
	}
	
	public void addEdge(Edge e) {
		this.edges.add(e);
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public Edge[] getEdges() {
		return (Edge[]) this.edges.toArray();
	}
	
}
