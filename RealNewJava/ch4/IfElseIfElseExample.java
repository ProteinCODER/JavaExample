package ch4;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() *20) +81 ; 
		
		String grade;
		
		if (score >= 90) {
			System.out.println("������ ����ϱ���");
			if (score >= 95) {
				grade = "A+";
			} else { 
				grade= "A";
			}
		} else {
			System.out.println("������ �״��̱���?");
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
		}
			
		}
		System.out.println("���� : "+ score);
		System.out.println("���� : "+ grade);
	}
}
