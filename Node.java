import java.util.ArrayList;
class Node {
	int name,color;		
	ArrayList<Node> adjList;
	
	Node(int name) {
		this.name = name;
		color = -1;
		adjList=new ArrayList<Node>();
	}
public int getNodeName() {
		return this.name;
	}
	
	public int getColor() {
		return this.color;
	}
	
	
	public void setColor(int color) {
		this.color=color;
	}
public String toString() {
		return Integer.toString(name)+" "+"color="+color;
	}
	
	public ArrayList<Node> getAdjList() {
		return this.adjList;
	}
}
