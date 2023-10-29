
public class Panagram {

	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		String s=str.toLowerCase();
		System.out.println(s);
		int cnt=0;
		
			for(int j=97;j<123;j++) {
				if(s.indexOf((char)j)==-1)
					cnt++;
			}
		
		System.out.println(cnt);

	}

}
