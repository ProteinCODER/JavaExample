package ch5;

public class CCar {
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {   // speed set °Ë»ç
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {           
		return stop;
	}

	public void setStop(boolean stop) {      // 
		this.stop = stop;
		this.speed = 0;
	}

}
