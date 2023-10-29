
public class LongestString {

    public static void main(String[] args) {
   //     String s = "aabbbddddaa";
    	 String s = "aaabbbbbcddbccaaddddd";
        String ls = "";
        String curr = String.valueOf(s.charAt(0));
        
        for(int i=1;i<s.length();i++) {
        	
        	if(s.charAt(i)==s.charAt(i-1)) {
        		curr +=s.charAt(i);
       	//	System.out.println(curr);
        		
        	}
        	else {
        		if(curr.length()>=ls.length()) {
        		
        			ls=curr;
        			
        		//	System.out.println(ls);
        		}
        		curr=String.valueOf(s.charAt(i));
        		
        	}
        	
        }
        
        if(curr.length()>=ls.length()) {
			ls=curr;
			
		}
        
        System.out.println(ls);

    }
}