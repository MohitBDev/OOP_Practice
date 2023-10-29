
public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Start");
		String str="Hello";
		
		//Approach 1
		char[] carr=str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(carr[i]);
			
		}
		System.out.println("");
		
		//Approach 2
				
				
				for(int i=str.length()-1;i>=0;i--) {
					System.out.print(str.charAt(i));
					
				}
		
				System.out.println("");
				
				//Approach 3
			StringBuilder sb=new StringBuilder(str);
			
			System.out.println(sb.reverse());
				
				
		
		
	}

}
