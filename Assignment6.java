package week3.day1;

public class Assignment6 {

	public static void main(String[] args) {
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
		 System.out.println("Justification: In String, the == operator is used to comparing the reference of the given strings, depending on if they are referring to the same objects. When we compare two strings using == operator, it will return true if the string variables are pointing toward the same java object. Otherwise, it will return false.Since, here str3 and str4 are two different references, it is returning false. ");
		 System.out.println("If we need to compare the values of string then we need to use string.equals() method");
		 
		 if(str3.equalsIgnoreCase(str4)) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
	}

}
