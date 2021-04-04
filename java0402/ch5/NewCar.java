package ch5;

public class NewCar {
	String model;
	int speed; // 필드 선언

	NewCar(String model) { // 생성자
		this.model = model; // 참조변수
	}

	void setSpeed(int speed) { // 메소드 선언
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "차가 달립니다." + "(시속" + this.speed + "km/h)");
		}
	}

}
