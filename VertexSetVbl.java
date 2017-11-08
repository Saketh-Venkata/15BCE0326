public class VertexSetVbl implements Vbl {
	TreeMap<Integer, Node> vertexSetTemp;
	
  public VertexSetVbl() {
		vertexSetTemp=new TreeMap<Integer, Node>();
	}
  
  
  public void reduce(Vbl vbl) {
		VertexSetVbl custVbl=(VertexSetVbl) vbl
		vertexSetTemp.put(custVbl.vertexSetTemp);
	}
  
  
  public void set(Vbl vbl) {
		this.vertexSetTemp = ((VertexSetVbl)vbl).vertexSetTemp;
	}
  
  public Object clone()
	{
		return new VertexSetVbl();
	}
	public void add(int nodeName, Node node) {
		this.vertexSetTemp.put(node.getNodeName(), node);
	}
  
  
  
  
  
  }
