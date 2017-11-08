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
