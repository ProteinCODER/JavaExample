package ch5;

public class CCarExample {

	public static void main(String[] args) {
		CCar myCar = new CCar();

		myCar.setSpeed(-50);

		System.out.println("����ӵ� : " + myCar.getSpeed());

		if (!myCar.isStop()) { // stop �ʵ��� Getter(isStop()) ���� ���� false �� ���, �ڵ����� ���߱����� Setter(setStop(true))��
								// ȣ���ؼ� stop�ʵ带 true�� speed �ʵ带 0���� �����Ѵ�
			myCar.setStop(true);
		}
		System.out.println("����ӵ� : " + myCar.getSpeed());

	}

}
