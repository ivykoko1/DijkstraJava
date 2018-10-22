package dijkstra.objects;

import java.util.ArrayList;
import java.util.Set;

public class Graph {
	
	private ArrayList<Node> nodes;
	
	public Graph() {
		this.nodes = new ArrayList<Node>();
	}
	
	public void addNode(Node n) {
		nodes.add(n);
	}
	
	public void connect(Node n1, Node n2, int distance){
		n1.addEdge(new Edge(n1, n2, distance));
		n2.addEdge(new Edge(n2, n1, distance));
	}
	
	
	public void dijkstra(Node source) {
		ArrayList<Node> unvisited = new ArrayList<Node>();
		ArrayList<Node> visited = new ArrayList<Node>();
		
		unvisited.add(source);
		source.setDistance(0);
		
		while(unvisited.size() > 0) {
			Node current = source;
			visited.add(current);
		}
	}

}
