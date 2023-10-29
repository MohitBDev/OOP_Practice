import java.util.HashMap;
import java.util.Map;

public class LongestsubStringLen {
	

	public static void main(String[] args) {
		String s="abcabcd";
		int maxlen=0;
		String str="";
		Map<Character,Integer> hs=new HashMap<>();
		for(int right=0 ,left=0;right<s.length();right++) {
			char curr=s.charAt(right);
			if(hs.containsKey(curr) &&hs.get(curr)>=left ) {
				left=hs.get(curr)+1;
				
			}
			maxlen=Math.max(maxlen, right-left+1);
			hs.put(curr, right);
			str=s.substring(left,right+1);
			
			
		}
		System.out.println(maxlen);
		System.out.println(str);
	

	}

}
