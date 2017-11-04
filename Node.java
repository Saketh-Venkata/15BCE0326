import java.util.ArrayList;
class Node {
	int name,color;		
	ArrayList<Node> adjList;
	
	Node(int name) {
		this.name = name;
		color=-1;
		adjList=new ArrayList<Node>();
	}
