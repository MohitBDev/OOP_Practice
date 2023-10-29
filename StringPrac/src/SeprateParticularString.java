
public class SeprateParticularString {
	public static void sepString(String str) {
		String s1 = "";
		String s2 = "";
		String s3 = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				s1+=str.charAt(i);
			}
			else if (Character.isDigit(str.charAt(i))) {
				s2+=str.charAt(i);
			}
			else {
				s3+=str.charAt(i);
				
			}

		}
		
		System.out.println("Alphabet :"+s1);
		System.out.println("Digit :"+s2);
		System.out.println("Special :"+s3);

	}	

	public static void main(String[] args) {
		String str = "abcdefgh1234%$#*";
		 sepString(str);
		

	}

}
















