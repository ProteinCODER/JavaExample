package ch5;

public class CarExample {

	public static void main(String[] args) {
		car2 c1 = new car2("모하비", "파랑");
		String carNumber;

		System.out.println("자동차 회사: " + c1.company);
		System.out.println("자동차 모델: " + c1.model);
		System.out.println("자동차 색깔: " + c1.color);
		System.out.println("최대 속력: " + c1.maxSpeed);
		System.out.println("현재 속도: " + c1.speed);

		c1.speed = (int) (Math.random() * 20) + 80;
		System.out.println("수정된 속도: " + c1.speed);

		carNumber = "12무3985";
		System.out.println("자동차 번호: " + carNumber);

	}

}
