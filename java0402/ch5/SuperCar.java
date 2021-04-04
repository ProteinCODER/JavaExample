package ch5;

public class SuperCar {
	
	int speed;
	
	void run( ) {
		System.out.println("도로 위 슈퍼카가"+speed+"km/h로 질주합니다");
	}
	
	public static void main(String[] args) {
		SuperCar sCar= new SuperCar();
		sCar.speed= (int)(Math.random()*100)+200;
		sCar.run();
	}


	}

