package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
	public static int sumS(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=(int)s.charAt(i);
		}
		
		return sum;
	}
	public static int ana(String s,String a) {
		int size=s.length();
		int i=0;
		int j=0;
		int k=a.length();
		int asum=sumS(a);
		int count=0;
		while(j<size) {
			if(j-i+1<k) {
				j++;
				
				
			}
			else if(j-i+1==k) {
				
				if(asum==sumS(s.substring(i,j+1))) {
					count++;
				}
				
				
				i++;
				j++;
				
			}
		}
		
		
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println(ana("forxorfxxrfoxrof","for"));
		
	
	
		
	}

}
