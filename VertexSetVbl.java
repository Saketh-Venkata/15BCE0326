import java.util.TreeMap;

import edu.rit.pj2.Vbl;

//Custom class which reduces thread local boundary vertices. 

public class VertexSetVbl implements Vbl {
	TreeMap<Integer, Node> vertexSetTemp;
	
	//Construct a new foursquare set containing the given numbers.
	//@param a,b,c,d number
	
  public VertexSetVbl() {
		vertexSetTemp=new TreeMap<Integer, Node>();
	}
  
  /*Reduce the given variable into this foursquare set. This foursquare set 
	 becomes the one with lexicographically largest value.
	  
	  @param  vbl variable.*/
	
  public void reduce(Vbl vbl) {
		VertexSetVbl custVbl=(VertexSetVbl) vbl;
		vertexSetTemp.putAll(custVbl.vertexSetTemp);
	}
  
  // Make this foursquare set be a copy of the given variable.
	  
	 // @param  vbl variable.
	
  public void set(Vbl vbl) {
		this.vertexSetTemp = ((VertexSetVbl)vbl).vertexSetTemp;
	}
  
	//Create a clone of this foursquare set.
		
  public Object clone()
	{
		return new VertexSetVbl();
	}
	public void add(int nodeName, Node node) {
		this.vertexSetTemp.put(node.getNodeName(), node);
	}
  }
