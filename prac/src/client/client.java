package client;
import static utils.populateData.populate;
import static utils.validationrules.validate;
import static utils.IOutils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import customException.EmpException;
import entiities.Employee;

public class client {
	public static void main(String [] args) throws EmpException {
		try(Scanner sc= new Scanner(System.in)){
		//emap.values().stream().filter().map().forEach()
		Employee emp1=validate( "king", "k", "2023-01-01", 2000);
	   Map<Integer,Employee> emap=new HashMap<>();
	   emap=populate();
	   emap.values().stream().forEach(e->System.out.println(e));
		System.out.println("Enter File Name to store ");//filename emp.dat to store any type of data audio and vido ,pdf etc 
		//filname emp.ser to store any type of java object 
	   store(sc.next(),emap);
	   System.out.println("Enter file name to restore");
	   Map<Integer,Employee> em=restore(sc.next());
	   em.values().forEach(e->System.out.println(e));
	   System.out.println("----Comparator by Date");
	   
	   em.values().stream().sorted((e1,e2)->e1.getJoiningdate().compareTo(e2.getJoiningdate())).forEach(e->System.out.println(e));
	  
	   System.out.println("----Comparable by firstname");
	   em.values().stream().sorted().forEach(e->System.out.println(e));
	  

		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
	}

}
