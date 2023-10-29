package Nimbers;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		String s="123";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum=sum*10+(s.charAt(i)-48);
			System.out.println(sum);
			
		}
		
		System.out.println(sum);

	}

}
