package Nimbers;

public class Binary {

	public static void main(String[] args) {
	int n=55;
	int n1=55;
	System.out.println(Integer.toBinaryString(n1));
	
	
	String str="";
	while(n!=0) {
	if(n%2==0) {
		str+='0';
	  n=n/2;
		
	}
	else {
		str+='1';	
		n=n/2;
	}
	}
	StringBuilder sb=new StringBuilder(str);
	System.out.println(sb.reverse());

	}

}
