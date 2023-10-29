package tester;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import EmplyExceptn.EmpExceptn;
import classs.Employee;
import static utils.Populatemap.*;
import static utils.EmployeeValidationRules.*;
import static utils.IOutils.*;

public class EmployeeMnag {

	public static void main(String[] args) throws EmpExceptn {
		boolean exit=false;
		Map<Integer,Employee> em=new HashMap<>();
		em=poulate();
		
		try(Scanner sc=new Scanner(System.in)) {
			while(!exit) {
				
				System.out.println("Enter option :");
				switch(sc.nextInt()) {
				
				case 1:
					
					System.out.println(" enter id and Enter id,  fname, lname, dept, joindate,  salary");
					em.put(sc.nextInt(),validate(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),em));
					System.out.println("emp added");
					break;
				case 2:
					em.values().stream().forEach(e->System.out.println(e));
					break;
				case 3:
					em.values().stream().sorted();
					break;
				case 4:
					em.values().stream().sorted((e1,e2)->e1.getLname().compareTo(e2.getLname()));
					break;
				case 5:
					System.out.println("Enter file name to store ");
					store(sc.next(),em);
					
					break;
				case 6:
					System.out.println("Enter file name to restore ");
					Map<Integer,Employee> emp= restore(sc.next());
					emp.values().forEach(s->System.out.println(s));
					break;
				case 7:
					break;
				case 0:
					break;
				
				}
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
