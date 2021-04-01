package ch5;

public class CarExample {

	public static void main(String[] args) {
		car myCar = new car();

		System.out.println("자동차 회사: " + myCar.company);
		System.out.println("자동차 모델: " + myCar.model);
		System.out.println("자동차 색깔: " + myCar.color);
		System.out.println("최대 속력: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);

		myCar.speed = (int) (Math.random() * 20) + 80;
		System.out.println("수정된 속도: " + myCar.speed);

	}

}
