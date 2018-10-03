import java.util.*;

class color{
	int cid;
	
	color(int cid){
		
		this.cid=cid;
	}
	
	void setCid(int cid){
		
		this.cid=cid;
	}
	
	int getCid(){
		
		return cid;
	}
	
	public boolean equals(Object o){
		
		color c = (color) o;
		
		if(cid==c.getCid())
			
			return true;
		
		return false;
	}
	
	public int hashCode(){
		
		return cid%10;
	}	
}

public class HashMapProblem {

	public static void main(String[] args) {

		Map<color,String> c = new HashMap<>();

		c.put(new color(10),"red");
		
		c.put(new color(20),"green");
		
		c.put(new color(30),"blue");
		
		c.put(new color(40),"black");
		
		c.put(new color(50),"yellow");
		
		Set s = c.entrySet();
		
		Iterator it= s.iterator();
		
		System.out.println("the key-value pairs are:");
		
		while(it.hasNext()){
		
			Map.Entry m = (Map.Entry)it.next();
			
			System.out.println((((color)m.getKey()).getCid())+"  "+ m.getValue());
		}
		
		
	}


}