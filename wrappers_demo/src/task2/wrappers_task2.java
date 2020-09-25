package task2;
// Goal: Imitate Demo1 using Double instead of Int primitive.

public class wrappers_task2 {

	public static void main(String[] args) {
		Double i1=10d;//common pool
		Double i2=10d;//common pool
		Double i3=new Double(10); //heap
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		//i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		
		System.out.println("i1.equals(i2) : "+i1.equals(i2));
		System.out.println("i1.equals(i3) : "+i1.equals(i3));
		
		/*
		 * public int obj1.compareTo(obj2) - used for sorting, it is available in all the wrapper classes & String class
		 * if value of obj1 is equals to the value of obj2 it will return 0 
		 * if value of obj1 is greater than value of obj2 it will return positive value
		 * if value of obj1 is smaller than value of obj2 it will return -ve value
		 */
		Double i4=99.0d;
		System.out.println("i4.compareTo(99.0d) : "+i4.compareTo(99.0d));
		System.out.println("i4.compareTo(9.0d) : "+i4.compareTo(9.0d));
		System.out.println("i4.compareTo(999.0d) : "+i4.compareTo(999.0d));
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		double x=i4; //Autoboxing
		System.out.println("x : "+x);
		
		x=10000;
		i4=x; //Autoboxing
		System.out.println("i4 : "+i4);
		
		String s="12443.55";
		
		double a=Double.parseDouble(s);  //Common across all the wrappers except Character
		System.out.println("a = "+a);
		
		a=1919191;
		s=a+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Double i5=77d;
		Double f=i5.doubleValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("f = "+f);
		int r=f.intValue();
		System.out.println("r : "+r);

	}

}
