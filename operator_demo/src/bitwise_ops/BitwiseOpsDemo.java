package bitwise_ops;

public class BitwiseOpsDemo {
	public static void main(String[] args) 
	{
		int a = 0x0101;
		int b = 0x0202;
		int c = 0x0101;
		int d = 0x0201;
		System.out.println("Variables:");
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		
		System.out.println("\n\nEvaluations:");
		System.out.println("The Bitwise Operator & returns the bit by bit value AND of input values");
		System.out.println("a&b = " + (a & b) + " a&c = " + (a & c) + " b&c = " + (b & c) + " a&d = " + (a & d) + " b&d = " + (b & d));

		System.out.println("\nThe Bitwise Operator | returns the bit by bit value OR of input values");		
		System.out.println("a|b = " + (a | b) + " a|c = " + (a | c) + " b|c = " + (b | c) + " a|d = " + (a | d) + " b|d = " + (b | d));
		
		System.out.println("\nThe Bitwise Operator ^ returns the bit by bit value XOR of input values");		
		System.out.println("a^b = " + (a ^ b) + " a^c = " + (a ^ c) + " b^c = " + (b ^ c) + " a^d = " + (a ^ d) + " b^d = " + (b ^ d));
		
		System.out.println("\nThe Bitwise Operator ~ returns the compliment of the input value (i.e., with all bits inversed)");		
		System.out.println("~a = " + (~a) + " ~b = " + (~b) + " ~c = " + (~c) + " ~d = " + (~d)); 

	}
	

}
