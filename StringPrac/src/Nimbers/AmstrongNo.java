package Nimbers;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Check Amstrong :");
	int n=sc.nextInt();
	int t=n;
	int sum=0;
	int cnt=0;
	while(t>0) {
		cnt++;
		t=t/10;
	}
t=n;

	while(t>0) {
		int temp=t%10;
		sum+=Math.pow(temp, cnt);
		
		t=t/10;
	
	}
	
	if(sum==n) {
		System.out.println("Amstrong");
	}
	else
		System.out.println("Not a Amstrong");
	}

}
