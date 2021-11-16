package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Deposit amount is 20000");
	}

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();

	}

}
