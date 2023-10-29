package Nimbers;

public class EvenOdd {
	
	public static String checkEvenorOdd(int n) {
		
	//	return ((n%2)==0)?"even":"odd";
		
	return ((n^1)==n+1)?"even":"odd";
		
	}

	public static void main(String[] args) {
		
		
		for(int i=1;i<=25;i++) {
			System.out.println(i+" "+checkEvenorOdd(i));
		}

	}

}
