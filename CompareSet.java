import java.util.*;


class Customer
{
	private int id;
	
	Customer(int id){
		
		this.id = id;
	}
	
	public int getId(){
		
		return id;
	}
	
	public void setId(int id){
		
		this.id = id;
	}
	
	public int hashCode(){

		return (id*10);
	}
	
	public boolean equals(Object o)
	{
		Customer c = (Customer)o;
		
		if(this.id == c.getId())
			
			return true;
		
		return false;
	}
}


public class CompareSet
{
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Set<Customer> s1 = new HashSet<>();
		
		Set<Customer> s2 = new HashSet<>();
		
		System.out.println("Enter the values for first set");
		
		for(int i=0 ; i<5 ; i++){
			
			int val = ip.nextInt();
			
			s1.add(new Customer(val));
		}
		
		System.out.println("Enter the values for second set");
		
		for(int i=0 ; i<5 ; i++){
			
			int val = ip.nextInt();
			
			s2.add(new Customer(val));
		}
		
		s1.retainAll(s2);
		
		System.out.println("common elements:");
		
		for(Customer c : s1)
		{
			System.out.print(c.getId() + " ");
		}
	}

}