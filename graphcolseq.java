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





