package genrics;

import java.util.ArrayList;
import java.util.List;

public class Tester {
	public static <T,V> void gen(T val,V val1) {
		System.out.println(val+"  "+val1);
		
		
	}
	public static  void printlist(List<?> list) {
		// ? wildcard any type of list 
		//? extends animal bounded wild card
		//T extends animal bounded Type
		
		
		
	}


	public static void main(String[] args) {
	Printer<Integer> p1=new Printer<>(23);
	Printer<Double> p2=new Printer<>(23.55);
	Printer<String> p3=new Printer<>("xyz");
	p1.prints();
//	p2.prints();
//	p3.prints();
	ArrayList<?> al=new ArrayList<>();
	gen("xyz",23);
	gen(23.55,34);

	}

}
 