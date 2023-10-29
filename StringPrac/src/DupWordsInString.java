import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupWordsInString {

	public static void main(String[] args) {
		String s="Hey Java is Java best language is Java";
		  String[] words=   s.split(" ");
		  Map<String,Integer> hm=new HashMap<>();
		  for(String w : words) {
			  if(hm.containsKey(w.toLowerCase()))
			  {
				  hm.put(w.toLowerCase(), hm.get(w.toLowerCase())+1);
			  }
			  else {
				  hm.put(w.toLowerCase(), 1);
			  }
		  }
		  
		  for(Entry h : hm.entrySet()) {
			  if((int)h.getValue()>1) {
				  System.out.println(h.getKey()+ ":" +h.getValue());
				  
			  }
          
			  
		  }
		  System.out.println(hm.toString());
		  System.out.println(Arrays.toString(words));

	}

}
