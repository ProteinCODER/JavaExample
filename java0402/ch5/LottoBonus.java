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
		System.out.println("���� �ζ� ��õ ��ȣ: ");
		for(int i=0;i<=6;i++) {
			System.out.println(Lotto[i]+" ");
			
		}

		System.out.println("����� ���ʽ� ��ȣ + : "+bonusNumber);
}
}
