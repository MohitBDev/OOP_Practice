package Nimbers;

import java.util.HashMap;
import java.util.Map;

public class DupDigits {

	public static void main(String[] args) {
	int n=1211123114;
	Map<Integer,Integer> hs=new HashMap<>();
	
	
	while(n>0) {
		int digit=n%10;
		if(hs.containsKey(digit)) {
			hs.put(digit, hs.get(digit)+1);
			
		}
		else {
			hs.put(digit, 1);
			
			
		}
		n=n/10;
		
	}
	System.out.println(hs.toString());

	}

}
