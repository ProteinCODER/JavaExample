package ch5;

public class CarExample {

	public static void main(String[] args) {
		car2 c1 = new car2("���Ϻ�", "�Ķ�");
		String carNumber;

		System.out.println("�ڵ��� ȸ��: " + c1.company);
		System.out.println("�ڵ��� ��: " + c1.model);
		System.out.println("�ڵ��� ����: " + c1.color);
		System.out.println("�ִ� �ӷ�: " + c1.maxSpeed);
		System.out.println("���� �ӵ�: " + c1.speed);

		c1.speed = (int) (Math.random() * 20) + 80;
		System.out.println("������ �ӵ�: " + c1.speed);

		carNumber = "12��3985";
		System.out.println("�ڵ��� ��ȣ: " + carNumber);

	}

}
