package conditional_ops;

public class ConditionalOpsDemo {
	public static void main(String[] args) 
	{
		String out; // For evaluation of a and b
		
		int  a = 6, b = 12, x = 20, y = 10, z = 30, result;
        // result holds max of three 
				
		out = a==b ? "Yes":"No";
		
		System.out.println("Variables:");
		System.out.println("a = "+ a + ", b = " + b + ", x = " + x + ", y = " + y + ", z = " + z);
		System.out.println("\n\nEvaluations:");
		System.out.println("Question: Is a equal to b?\n\nAnswer: "+out);
		  

		    /* Syntax Exp1 ? Exp2 : Exp3;
		     * If the value of Exp1 is true, then Exp2 is the output
		     * If the value of Exp1 is false, then Exp3 is the output
		     * 
		     * The conditional statement defining 'result' below translates in an if/then statement to:
		     * result = IF (x > y) THEN 
		     *          IF (x > z) THEN x 
		     *          ELSE IF (y > z)
		     *          THEN y
		     *          ELSE z
		     */
		
	        result = ((x > y) ? (x > z) ? x : z : (y > z) ? y : z);

	        System.out.println("\n\nMax of x, y, and z variables using conditional operator = "
	                           + result); 
	}



}
