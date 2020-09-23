package relational_ops;

public class RelationalOpsDemo {
	public static void main(String[] args)
	{
		// Variable and Array Declarations
		int a = 2, b = 3;
		String x = "Hello", y = "World", z = "World";
			
		// Relational Operator application //
		System.out.println("Variables:");
		System.out.println("a = " + a + ", b = "+ b + ", x = " + x + ", y = " + y + ", z = " + z);
		// Equivalence //
		System.out.println("\n\nEvaluations:");
		System.out.println("Equivalence: a == b: " + (a == b));
		System.out.println("Equivalence: x == y: " + (x == y));
		System.out.println("Equivalence: y == z: " + (y == z));
		// Greater Than //
        System.out.println("Less Than: a < b: " + (a < b));
        // Greater Than or Equal To //
        System.out.println("Less Than or Equal To: a <= b: " + (a <= b));
        // Less Than
        System.out.println("Greater Than: a > b: " + (a > b));
        // Less Than or Equal To //
        System.out.println("Greater Than or Equal To: a >= b: " + (a >= b));
        // Not Equal to //
        System.out.println("Not Equal: a != b: " + (a != b));
	}

}
