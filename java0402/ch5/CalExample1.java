package ch5;

public class CalExample1 {

	public static void main(String[] args) {
		cal1 myCal= new cal1();
		
		double result1= myCal.areaRectangle(15);
		double result2= myCal.areaRectangle(10, 15);
		
		System.out.println("정사각형의 넓이: "+result1);
		System.out.println("직사각형의 넓이: "+result2);

	}

}
