package task3;

public class wrappers_task3 {
	// Goal: Imitate Demo1 using Long instead of Int primitive.

	public static void main(String[] args) {

			Long i1=10L;//common pool
			Long i2=10L;//common pool
			Long i3=new Long(10); //heap
			
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
			Long i4=99L;
			System.out.println("i4.compareTo(99L) : "+i4.compareTo(99L));
			System.out.println("i4.compareTo(9L) : "+i4.compareTo(9L));
			System.out.println("i4.compareTo(999L) : "+i4.compareTo(999L));
			
			System.out.println(Long.MAX_VALUE);
			System.out.println(Long.MIN_VALUE);
			
			long x=i4; //Autoboxing
			System.out.println("x : "+x);
			
			x=10000;
			i4=x; //Autoboxing
			System.out.println("i4 : "+i4);
			
			String s="12443";
			
			long a=Long.parseLong(s);  //Common across all the wrappers except Character
			System.out.println("a = "+a);
			
			a=1919191;
			s=a+"";//anything in java can be converted to the String by just doing this
			System.out.println("s : "+s);
			
			Long i5=77L;
			Long f=i5.longValue(); //doubleValue() //shortValue() //longValue()
			System.out.println("f = "+f);
			int r=f.intValue();
			System.out.println("r : "+r);

		}
	
}
