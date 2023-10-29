package Nimbers;

public class ReverseANum {

	public static void main(String[] args) {
		int a=1234;
		int k=0;
		while(a>0) {
			k=a%10+k*10;
			a=a/10;
			
		}
		System.out.println(k);

	}

}
