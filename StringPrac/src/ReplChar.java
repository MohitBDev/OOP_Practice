
public class ReplChar {

	public static void main(String[] args) {
		String str="opentext";
		char ctr='t';
		char[] arr=str.toCharArray();
		int j=1;
		for(int i=0;i<str.length();i++) {
			if(arr[i]==ctr) {
			arr[i]=String.valueOf(j).charAt(0);
				//arr[i]=(char)j;
				j++;
			}
		}
		if(j==49) {
			System.out.println("Charter not present");
		}
		System.out.println(arr);

	}

}
