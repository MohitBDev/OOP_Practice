import java.util.LinkedHashSet;
import java.util.Set;

public class RmvDupVal {

	public static void main(String[] args) {
		String str="Programming";
		
		
		//Aproach 1
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		//Approach  2
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			if(idx==-1) {
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		
	//Aproach 3
		StringBuilder sb2=new StringBuilder();
		char[] carr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			boolean rep=false;
			for(int j=i+1;j<str.length();j++) {
				
				if(carr[i]==carr[j]) {
				rep=true;
				break;
				}
			}
			if(!rep) {
				sb2.append(carr[i]);
			}
			
			
			
		}
		System.out.println(sb2);
		 
		
		//Aproach 4
		StringBuilder sb3=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		for(Character s:set) {
			sb3.append(s);
		}
		System.out.println(sb3);
		

	}

}
