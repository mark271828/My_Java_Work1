package task1;
// Goal: Perform same conversion as TitleCaseDemo.java, but on last letter of each word.

public class buffer_builder_task1 {

	public static void main(String[] args) {
		String s="this exercise converts the last character of each work to upper case";
		
		String ar[]=s.split(" ");
		// This the original value
		
		StringBuilder sb1=new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			sb1.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		
		System.out.println(sb1.toString().trim());

		// This is the modified string
		StringBuilder sb2=new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			sb2.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		
		System.out.println(sb2.toString().trim());



	}

}
