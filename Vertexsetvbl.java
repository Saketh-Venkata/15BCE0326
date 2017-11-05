public class VertexSetVbl implements Vbl {
	TreeMap<Integer, Node> vertexSetTemp;
	
  public VertexSetVbl() {
		vertexSetTemp=new TreeMap<Integer, Node>();
	}
  
  
  public void reduce(Vbl vbl) {
		VertexSetVbl custVbl=(VertexSetVbl) vbl
		vertexSetTemp.put(custVbl.vertexSetTemp);
	}
  
  
  
  
  
  
  
  
  
  
  }
