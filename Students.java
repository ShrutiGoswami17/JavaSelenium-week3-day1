package week3.day1;

public class Students {

	public void getStudentinfo(int id)
	{
		System.out.println("Student ID is:"+id);
	}
	
	public void getStudentinfo(int id,String name)
	{
		System.out.println("Student ID is:"+id);
		System.out.println("Student name is:"+name);
	}
	
	public void getStudentinfo(String email,double phno)
	{
		System.out.println("Student email is:"+email);
		System.out.println("Student Phone no. is:"+phno);
	}
	public static void main(String[] args) {
		
		Students s=new Students();
		
		s.getStudentinfo(17);
		s.getStudentinfo(19, "Shruti");	
		s.getStudentinfo("shruti@gmail.com", 9898877665d);
	}

}
