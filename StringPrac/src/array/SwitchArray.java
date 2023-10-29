package array;

import java.util.Scanner;

public class SwitchArray {

	public static void main(String[] args) {
		
        int ch;
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter Array Size : ");
	int[] arr = new int[sc.nextInt()];
	System.out.println("1: Enter Array Elements  ");
	System.out.println("2: Delete Array Element  ");
	System.out.println("3: Search In Array");
	System.out.println("4: Display Array");
	System.out.println("5: Sort Array");
	
	System.out.println("0: Exit  ");

		do {
			System.out.println("Enter Choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				 for(int i=0;i<arr.length;i++) {
			    	 System.out.println("Enter Array Element :" +(i+1));
			    	 arr[i]=sc.nextInt();
			    	 
			     }
				
				break;
			case 2:
				System.out.println("Enter Element to Delete");
				int del=sc.nextInt();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==del) {
						arr[i]=0;
						System.out.println("Element Deleted");
					}
				}
				break;
			case 3:
				System.out.println("Enter Element to Search");
				int ser=sc.nextInt();
				boolean flag=false;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==ser) {
						flag=true;
					System.out.println(arr[i]+"  Present at Index  "+(i+1));
					}
					
				}
				if(!flag) {
					System.out.println("Elemnt Not Present");
				}
				
				
				break;
			case 4:
				for(int a:arr) {
					System.out.print(" " +a);
				}
				System.out.println("");
				break;
			case 5:
				int temp;
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
					}
				}
				System.out.println("Array Sorted");
				break;
			case 0:
				break;
				
			}
			
		}
		while(ch>=1);
		
		

	}
 
}
