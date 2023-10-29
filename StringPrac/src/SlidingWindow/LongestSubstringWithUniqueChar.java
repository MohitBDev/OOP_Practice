package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithUniqueChar {
	public static int LongSub(String s,int k) {
	    int size=s.length();
	    int i=0;
	    int j=0;
	    int maxlen=0;
	    String sub="";
	    Map<Character,Integer> hs=new HashMap<>();
	    while(j<size) {
	    	char p=s.charAt(j);
	    	
	    	  hs.put(p, hs.getOrDefault(p, 0) + 1);
	    		
	    		
	    	
	    	
	    	if(hs.size()<k) {
	    		j++;
	    	}
	    	else if(hs.size()==k) {
	    		maxlen=Math.max(maxlen, j-i+1);
	    		sub=s.substring(i,j+1);
	    		j++;
	    		
	    	}
            else if(hs.size()>k) {
	    		while(hs.size()>k){
	    			char c=s.charAt(i);
	    			
	    			hs.put(c, hs.get(c)-1);
	    			if(hs.get(c)==0)
	    				hs.remove(c);
	    			i++;
	    			
	    		}
            	j++;
	    	}
	    	
	    	System.out.println(sub);
	    }
	    return maxlen;
		
		
	}

	public static void main(String[] args) {
		String s="aabacbebebe";
	
		
		System.out.println(LongSub( s, 3));
	

	}

}
