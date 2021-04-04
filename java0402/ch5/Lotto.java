package ch5;

public class Lotto {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		int bonusNumber= 1;
		
		bonusNumber=(int)(Math.random()*45)+1;

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;

				}
			}
		}
		System.out.println("로또번호 추첨: ");
		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println(" 보너스 번호 + : "+bonusNumber);
	}
}