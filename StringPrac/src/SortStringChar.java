import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		
		//Aproach 1
		String str="dbca";
		char temp;
		char[] arr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(arr);
		
		
		//Aprroach 2
		char[] arr1=str.toCharArray();
		Arrays.sort(arr1);
		System.out.println(arr1);
		

	}

}
