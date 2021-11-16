package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("Connecting Whatsapp");
	}
	
	public void takeVideo() {
		System.out.println("Taking Video from Smartphone");
	}
	 public static void main(String[] args) {
		 SmartPhone phone1=new SmartPhone();
		 
		 phone1.takeVideo();
	 }

}
