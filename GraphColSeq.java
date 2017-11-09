import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import edu.rit.pj2.Task;

public class GraphColSeq extends Task{
	int noOfVertices,noOfEdges;
	TreeMap<Integer, Node> vertexSet;
public void main(String[] args) throws NumberFormatException, IOException {
		if (args.length != 1) {
			usage();
		}
	GraphColSeq graphColSeq=new GraphColSeq();
		Graph graph=graphColSeq.readInput(args[0]);
		Long start=System.currentTimeMillis();
		graphColSeq.colorVertices(graph);
	Long end=System.currentTimeMillis();
		graphColSeq.printAndGetNoOfColors(graph);
	System.out.println(end-start+" msec");
	}
private void printAndGetNoOfColors(Graph graph) {
		vertexSet=graph.getVertexSet();
		int max=0, color;
		for(int i=0;i<vertexSet.size();i++) {
			color=vertexSet.get(i).getColor();
System.out.println("Vertex:"+vertexSet.get(i).getNodeName()+
					",color:"+color);
			if(color>max)
				max=color;
		}
	System.out.println("Total number of colors required:"+(max+1));
	}
	private Graph readInput(String fileName) throws IOException {
		int currVertex1, currVertex2;
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		FileReader(fileName));
		String line;
		Graph graph=new Graph();
		while((line=br.readLine()) != null) {
            String[] vertex=line.split(" "); 
			currVertex1=Integer.parseInt(vertex[0]);
            currVertex2=Integer.parseInt(vertex[1]);
			graph.addVertex(currVertex1,currVertex2);
			graph.addVertex(currVertex2,currVertex1);
		 }
		return graph;
	}
	private void colorVertices(Graph graph) {
		vertexSet=graph.getVertexSet();
		noOfVertices=vertexSet.size();
		Node node;
		ArrayList<Node> adjList;
		ArrayList<Integer> adjColorList=new ArrayList<Integer>();
		for(int i=0;i<vertexSet.size();i++) {
			node=vertexSet.get(i);
			adjList=node.getAdjList();
			for(Node adjNode:adjList) 
adjColorList.add(adjNode.getColor());
			}
			int possibleColor=0;
			while(adjColorList.contains(possibleColor)) {
				++possibleColor;
			}
			node.setColor(possibleColor);
			adjColorList.clear();
		}
	}
	
	
	private void usage() {
		System.err.println("Usage: java pj2 GraphColSeq <fileName>");
		throw new IllegalArgumentException();
	}
	
   
   protected static int coresRequired() {
      return 1;
   }
}








