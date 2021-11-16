package week3.day1;



public class Calculator {
	
	public void add(int num1,int num2) {
		System.out.println("Add 2 int: "+(num1+num2));
	}
	
	public void add(int num1,int num2,int num3) {
		System.out.println("Add 3 int: "+(num1+num2+num3));
	}
	
	public void multiply(int num1,int num2) {
		System.out.println("Multiply 2 int:"+(num1*num2));
	}
	
	public void multiply(int num1,double num2) {
		System.out.println("Multiply 1 int and 1 double: "+(num1*num2));
	}
	
	public void subtract(int num1,int num2) {
		System.out.println("Subtract 2 int: "+(num1-num2));
	}
	
	public void subtract(double num1,double num2) {
		System.out.println("Subtract 2 double:"+(num1-num2));
	}
	
	public void divide(int num1,int num2) {
		System.out.println("divide 2 int :"+(num1/num2));
	}
	
	public void divide(double num1,int num2) {
		System.out.println("Divide a double by int:"+(num1/num2));
	}

	public static void main(String[] args) {
		Calculator calC=new Calculator();
		calC.add(1, 2);
		calC.add(1,2,3);
		calC.multiply(2, 3);
		calC.multiply(2, 5678d);
		calC.subtract(10, 5);
		calC.subtract(23456d, 3455d);
		calC.divide(10, 2);
		calC.divide(23456d, 2);

	}

}
