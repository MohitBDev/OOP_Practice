
public class RmvSplChar {

	public static void main(String[] args) {
		
		String str="j$a@v#*a%";
		//Aprroach 1
		String pstr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(pstr);
		
		
		
		

	}

}
;