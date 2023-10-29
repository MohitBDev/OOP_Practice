import java.util.HashMap;
import java.util.Map;

public class LongSubStr {

	public static void main(String[] args) {
		String str = "aabbcdddde";
		StringBuilder sb =new StringBuilder();
		Map<StringBuilder,Integer> hm=new HashMap<>();
		int max=0;
		for(int i=0;i<str.length();i++) {
			boolean unq=true;
			
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					sb.append(str.charAt(i));
					unq=false;
					max++;
					break;
					
				}
				
			}
			if(unq) {
				System.out.println(str.charAt(i));
				System.out.println(sb);
				hm.put(sb, max);
				System.out.println(hm.toString());
				
				break;
				
				
			}
			
		}
		
			}
		}
		


