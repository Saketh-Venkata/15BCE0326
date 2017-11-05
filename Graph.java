import java.util.ArrayList;
import java.util.TreeMap;

class Graph {
	TreeMap<Integer, Node> vertices;
	int numVertices;
	int numEdges;


	public Graph() {
		vertices = new TreeMap<Integer, Node>();
		numVertices = 0;
		numEdges = 0;
	}	

	
	public void addVertex(int vertex1, int adjVertex) {
		Node nodeVertex1=containsVertex(vertex1);
		Node nodeVertex2=containsVertex(adjVertex);
		nodeVertex1.adjList.add(nodeVertex2);
		++this.numVertices;
	}

	public Node containsVertex(int vertex) {
		if(this.vertices.containsKey(vertex))
			return this.vertices.get(vertex);
		else {
			Node newNode=new Node(vertex);
			vertices.put(vertex, newNode);
			return newNode;
		}
	}

	
	public Node getVertex(int name) {
		return this.vertices.get(name);
	}

	public TreeMap<Integer, Node> getVertexSet() {
		return this.vertices;
	}

	public int getNumVertices() {
		return this.numVertices;
	}

	public int getNumEdges() {
		return this.numEdges;
	}
}
