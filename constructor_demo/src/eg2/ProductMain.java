package eg2;

public class ProductMain {

	public static void main(String[] args) 
	{
	Product p1=new Product(1001001, "Machine1", 7, 52314.77);
	System.out.println(p1);
	System.out.println(p1.toString());
	System.out.println(p1.hashCode());
	
	Product p2=new Product(1001002, "Machine2", 5, 666.88);
	System.out.println(p2);
	System.out.println(p2.toString());
	System.out.println(p2.hashCode());
	
	
	// This is when the new fields were added //
	Product p3=new Product(1001003, "Machine3", 9, 14535423.14, "This is the description of Machine3.", "Aisle 4");	
	System.out.println(p3);
	System.out.println(p3.toString());
	System.out.println(p3.hashCode());
	
	}

}
