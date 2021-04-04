package ch5;

public class CarExample1 {
	public static void main(String[] args) {
		Car1 myCar= new Car1();
		
		myCar.setGas(5);
		
		boolean gasState= myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
		myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("가스 주입 필요 없습니다");
		} else {
			System.out.println("가스를 주입해주세요.");
		}
	}
}