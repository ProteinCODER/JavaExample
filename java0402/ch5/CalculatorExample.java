package ch5;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();

		int result1 = myCal.plus(5, 6);
		System.out.println("result1= " + result1);

//		byte x = 10;
//		byte y = 20;
		double result2 = myCal.divide(10, 20);
		System.out.println("result2= "+result2);
		
		myCal.powerOff();

	}

}
