package ch5;

public class NewCar {
	String model;
	int speed; // �ʵ� ����

	NewCar(String model) { // ������
		this.model = model; // ��������
	}

	void setSpeed(int speed) { // �޼ҵ� ����
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "���� �޸��ϴ�." + "(�ü�" + this.speed + "km/h)");
		}
	}

}
