package dijkstra.objects;

public class Edge {
	
	private Node source, destination;
	private int length;
	
	public Edge(Node source, Node destination, int length) {
		this.source = source;
		this.destination = destination;
		this.length = length;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public Node getSource() {
		return source;
	}


	public Node getDestination() {
		return destination;
	}


	public void setSource(Node source) {
		this.source = source;
	}


	public void setDestination(Node destination) {
		this.destination = destination;
	}

	
}
