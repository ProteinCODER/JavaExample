package ch5;

public class CarExample1 {
	public static void main(String[] args) {
		Car1 myCar= new Car1();
		
		myCar.setGas(5);
		
		boolean gasState= myCar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�");
		myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("���� ���� �ʿ� �����ϴ�");
		} else {
			System.out.println("������ �������ּ���.");
		}
	}
}