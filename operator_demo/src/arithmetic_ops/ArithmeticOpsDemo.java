package arithmetic_ops;

public class ArithmeticOpsDemo {
	public static void main(String[] args)
	{
		// Variable Declaration //
		int a = 2, b = 7, c = 9, d = 8, e = 0, f = 4;
		String x = "Arithmetic", y = "Operator", z = "Demo";
		
		System.out.println("Variables:");
		System.out.println("a = " + a + ", b = " + b + ", c = " + ", d = " + d + ", e = " + e + ", f = " + f);
		
		System.out.println("\n\nEvaluations:");
		// + and - used as operators 
        System.out.println("a + b + c + d - f = " + (a + b + c + d - f)); 
        System.out.println("c - f = " + (c - f)); 
  
        // + operator used with strings  
        System.out.println("x + y + z = " + x + " " + y + " " + z); 
  
        // * and / operators 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
  
        // % is mod operator 
        // on dividing first operand with second 
        System.out.println("d % c = " + (d % c)); 
  
        // Division by zero prohibited, and throws Exception
        //System.out.println(a/e); 
	}
	
}
