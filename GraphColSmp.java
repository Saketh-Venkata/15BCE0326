import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

import edu.rit.pj2.Loop;
import edu.rit.pj2.Task;
public class GraphColSmp extends Task {
	int noOfVertices,noOfEdges, supersteps;
	int noOfVerticesByProcessors;
	int noOfCores, initialNoOfCores;
	TreeMap<Integer, Node> vertexSet;
	Vector<Integer> colorHashtable;
	VertexSetVbl vertexSetVbl;
	boolean flag=true;
	List<Integer> list = null;
public void main(String[] args) throws NumberFormatException, IOException {
		if (args.length != 1) {
			usage();
		}
		GraphColSmp graphColSeq=new GraphColSmp();
		Graph graph=graphColSeq.readInput(args[0],Math.max(cores(), 1));
		Long start=System.currentTimeMillis();
		graphColSeq.colorVertices(graph);
		Long end=System.currentTimeMillis();
		graphColSeq.printAndGetNoOfColors(graph);
		System.out.println("Time taken:"+(end-start)+" msec");
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
	private void colorVertices(Graph graph) {
		vertexSet=graph.getVertexSet();
		//supersteps=1;
		while(vertexSet.size()!=0) {
			noOfVertices=vertexSet.size();
			if(noOfVertices==1) 
				noOfCores=1;
			else
				if(noOfVertices<=noOfCores)
					noOfCores=noOfVertices-1;
			noOfVerticesByProcessors=(int) Math.round((double)noOfVertices/noOfCores);
			if(!flag) {
				list=new ArrayList<Integer>(vertexSet.keySet());
				//System.out.println("List is "+list);
			}
