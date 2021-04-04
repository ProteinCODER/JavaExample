package ch5;

public class LottoBonus {

	public static void main(String[] args) {
		int Lotto[]= new int[6];
		int bonusNumber=1;
		
		bonusNumber= (int)(Math.random()*45)+1;
		
		for(int i=0;i<=6;i++) {
			Lotto[i]= (int)(Math.random()*45)+1;
			
			for(int j=0;j<i;j++) {
				if(Lotto[i] == Lotto[j]) {
					i--;
					break;
				}
			}
	}
		System.out.println("랜덤 로또 추천 번호: ");
		for(int i=0;i<=6;i++) {
			System.out.println(Lotto[i]+" ");
			
		}

		System.out.println("행운의 보너스 번호 + : "+bonusNumber);
}
}
