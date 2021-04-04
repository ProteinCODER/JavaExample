package ch5;

public class Cal {
	int plus(int x,int y) {
		int result =x+y;
		return result;
	}
	
	double avg (int x,int y) {
		double sum= plus(x,y);
		double result= sum /2;
		return result;
	}
	void excute() {
		double result= avg(7,10);
		System.out.println("실행결과: "+result);
	}
	}

