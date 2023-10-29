package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongSubAllUnqChar {
	public static int LongSub(String s) {
	    int size=s.length();
	    int i=0;
	    int j=0;
	    int maxlen=0;
	    String sub="";
	    Map<Character,Integer> hs=new HashMap<>();
	    while(j<size) {
	    	char p=s.charAt(j);
	    	
	    	  hs.put(p, hs.getOrDefault(p, 0) + 1);
	    		
	    		
	    	
	    	
	    	if(hs.size()>j-i+1) {
	    		j++;
	    	}
	    	else if(hs.size()==j-i+1) {
	    		maxlen=Math.max(maxlen, j-i+1);
	    		sub=s.substring(i,j+1);
	    
	    		j++;
	    		
	    	}
            else if(hs.size()<j-i+1) {
	    		while(hs.size()<j-i+1){
	    			
	    			char c=s.charAt(i);
	    			System.out.println();
	    			hs.put(c, hs.get(c)-1);
	    			if(hs.get(c)==0)
	    				hs.remove(c);
	    			
	    			
	    			i++;
	    			
	    		}
                j++;
	    	}
	    	
	    	//System.out.println(sub);
	    //	System.out.println(hs.toString());
	    }
	    return maxlen;
		
		
	}

	public static void main(String[] args) {
		String s="pwwkew";
	
		
		System.out.println(LongSub( s));
	

	}

}
