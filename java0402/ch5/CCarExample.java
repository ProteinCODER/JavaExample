package ch5;

public class CCarExample {

	public static void main(String[] args) {
		CCar myCar = new CCar();

		myCar.setSpeed(-50);

		System.out.println("현재속도 : " + myCar.getSpeed());

		if (!myCar.isStop()) { // stop 필드의 Getter(isStop()) 리턴 값이 false 일 경우, 자동차를 멈추기위해 Setter(setStop(true))를
								// 호출해서 stop필드를 true로 speed 필드를 0으로 변경한다
			myCar.setStop(true);
		}
		System.out.println("현재속도 : " + myCar.getSpeed());

	}

}
