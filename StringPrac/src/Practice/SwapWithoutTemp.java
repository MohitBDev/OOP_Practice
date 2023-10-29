package Practice;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int x=10;
		int y=5;
		
// 1		
//		x=x+y;
//		y=x-y;
//		x=x-y;
		
//2		
//		x=x*y;
//		y=x/y;
//		x=x/y;
		
//3
		x=x^y;
	
		y=x^y;
		
		x=x^y;
	
		
		
		
		
		
		
		
		
		System.out.println("x:"+x +" y:"+y);

	}

}
