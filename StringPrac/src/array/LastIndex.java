package array;

public class LastIndex {

	public static void main(String[] args) {
		String s="01010";
		char[] arr=s.toCharArray();
		int idx=-1;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]=='1')
				idx=i;
		}
		System.out.println("index :"+idx);
	}

}
