package logical_ops;

public class LogicalOpsDemo {
	public static void main(String[] args)
	{
		// Logical operator demo for AND/OR  //
	String x = "John";
	String y = "Jack";
	String z = "Jack";
	
	Boolean out1 = true;
	Boolean out2 = true;
	
	out1 = ( x == y && x == z );
	out2 = ( x == y || x == z );
	
	System.out.println("Variables:");
	System.out.println("x = " + x + ", y = " + y + ", z = " + z);
	
	System.out.println("\n\nEvaluations:");
	System.out.print("The statement String x is equal to String y\nAND\nString x is equal to String z is...\n"+ out1);
	System.out.print("\n\nThe statement String x is equal to String y\nOR\nString x is equal to String z is...\n"+ out2);
	}
}
