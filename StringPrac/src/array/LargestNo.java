package array;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNo {
	static class Largest implements Comparator<String>{
		@Override
		public int compare(String str1,String str2) {
			return (str2+str1).compareTo(str1+str2);
			
			
		}
		
	}

	public static void main(String[] args) {
		int [] arr= {3,30,34,5,9};
		
		String[] srr=new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			srr[i]=String.valueOf(arr[i]);
			
		}
		
		StringBuilder sb =new StringBuilder();
		
		Arrays.sort(srr,new Largest());
		
		for(String s: srr) {
			sb.append(s);
		}
		
		System.out.println(sb);
		
	}

}
