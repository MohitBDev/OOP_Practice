import java.util.HashSet;
import java.util.Set;

public class DupString {

	public static void main(String[] args) {
		String str="Programming";
		Set<Character> ss=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))!=-1 && str.indexOf(str.charAt(i)) ==i) {
				sb.append(str.charAt(i));
				
			}
		}
		System.out.println(sb.toString());

	}

}
