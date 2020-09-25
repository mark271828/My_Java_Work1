package regex;

// Goal: To validate static data: 
// Social Security Number
// Drivers License Number
// Area Code
// License Plate 

public class validate_info_task1 {
	
	public static void main(String[] args) {

	String ssn="123-45-9876";
	String dL="A53398734987";
	String area="312";
	String plate="A87 100 2";
	
	System.out.println("The SSN number is "+ssn);
	System.out.println("The Drivers License number is "+dL);
	System.out.println("The Area Code is "+area);
	System.out.println("The License Plate value is "+plate);
	
	if(ssn.matches("[1-9]{3}-[0-9]{2}-[0-9]{4}")) 
		{
		System.out.println("\n"+ssn+" is a valid SSN");
		}else {
			System.out.println("\n"+ssn+" is not a valid SSN");
		}
		
	if(dL.matches("[A-Z]{1}[0-9]{11}")) 
		{
		System.out.println(dL+" is a valid Drivers License Number");
		}else {
		System.out.println(dL+" is not a valid Drivers License Number");
		}
	
	if(dL.matches("[1-9]{1}[0-9]{2}")) 
		{
		System.out.println(area+" is a valid Area Code");
		}else {
		System.out.println(area+" is not a valid Area Code");
		}
	
	if(dL.matches("[A-Z0-9 ]{8}")) 
		{
		System.out.println(plate+" is a valid License Plate Value");
		}else {
		System.out.println(plate+" is not a valid License Plate Value");
		}
}

}
//+1-9123456780
//"\\+1-[0-9]{10}" when using meta characters make sure you use \\behind the meta character to avoid any error


