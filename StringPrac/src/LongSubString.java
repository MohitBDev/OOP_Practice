//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class LongSubString {

	public static void main(String[] args) {
		String str = "aabbcdddde";
	
		String s="";
		String ls="";
		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				 s += str.charAt(i);
				 ls=str.substring(0,i);
				break;
			}
			


		}
		System.out.println(ls);
		System.out.println(s);

	}
}
