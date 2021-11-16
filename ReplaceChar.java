package week3.day1;

public class ReplaceChar {

	public static void main(String[] args) {
		String sentance = "I am working with Java8";
		System.out.println("REplacing 8 with 11 in the sentance: "+sentance.replace("8", "11"));
		
		String str=sentance.substring(5, 15);
		System.out.println("Printing the string from index 5-14: "+str);
	}

}
