package ch5;

public class CarExample {

	public static void main(String[] args) {
		car myCar = new car();

		System.out.println("�ڵ��� ȸ��: " + myCar.company);
		System.out.println("�ڵ��� ��: " + myCar.model);
		System.out.println("�ڵ��� ����: " + myCar.color);
		System.out.println("�ִ� �ӷ�: " + myCar.maxSpeed);
		System.out.println("���� �ӵ�: " + myCar.speed);

		myCar.speed = (int) (Math.random() * 20) + 80;
		System.out.println("������ �ӵ�: " + myCar.speed);

	}

}
