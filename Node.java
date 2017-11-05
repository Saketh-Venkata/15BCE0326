import java.util.ArrayList;
class Node {
	int name,color;		
	ArrayList<Node> adjList;
	
	Node(int name) {
		this.name = name;
		color = -1;
		adjList=new ArrayList<Node>();
	}
public int getNodeName() {       //gets the id of this node
		return this.name;
	}
	
	public int getColor() {   //gets the color of this node 
		return this.color;
	}
	
	
	public void setColor(int color) {     //sets the color of this node
		this.color=color;
	}
public String toString() {
		return Integer.toString(name)+" "+"color="+color;
	}
	
	public ArrayList<Node> getAdjList() {    //return a set adjacent vertices of this node.
		return this.adjList;
	}
}
