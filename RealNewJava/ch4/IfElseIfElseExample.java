package ch4;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = (int) (Math.random() *20) +81 ; 
		
		String grade;
		
		if (score >= 90) {
			System.out.println("성적이 우수하군요");
			if (score >= 95) {
				grade = "A+";
			} else { 
				grade= "A";
			}
		} else {
			System.out.println("성적이 그닥이군요?");
			if(score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
		}
			
		}
		System.out.println("점수 : "+ score);
		System.out.println("학점 : "+ grade);
	}
}
