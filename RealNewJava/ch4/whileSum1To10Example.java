package ch4;

public class whileSum1To10Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i <=100) {
			sum += i ;
			i++;
			
		}
		System.out.println("1부터 100까지의 합= "+ sum);
	}

}
