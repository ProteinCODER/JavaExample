package ch5;

public class SuperCar {
	
	int speed;
	
	void run( ) {
		System.out.println("���� �� ����ī��"+speed+"km/h�� �����մϴ�");
	}
	
	public static void main(String[] args) {
		SuperCar sCar= new SuperCar();
		sCar.speed= (int)(Math.random()*100)+200;
		sCar.run();
	}


	}

