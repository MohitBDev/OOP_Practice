package array;

import java.util.Scanner;

public class InsertInArray {

	public static void main(String[] args) {
		 int[] arr=new int[5];
		try(Scanner sc=new Scanner(System.in)){
    
     
     for(int i=0;i<arr.length;i++) {
    	 System.out.println("Enter Array Element :" +(i+1));
    	 arr[i]=sc.nextInt();
    	 
     }
		}catch( Exception e) {
			e.printStackTrace();
			e.getMessage();
			
		}finally {
			System.out.print("ARRAY :");
			for(int a:arr) {
				
				System.out.print(" "+a);
			}
		}

	}

}
