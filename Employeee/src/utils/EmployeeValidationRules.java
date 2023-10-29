package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import EmplyExceptn.EmpExceptn;
import classs.Dept;
import classs.Employee;

public class EmployeeValidationRules {
	
	public static Employee validate(int id, String fname, String lname, String dept, String joindate, double salary,Map<Integer,Employee> emap) throws EmpExceptn {
		String fn=chkdup(fname,emap);
		Dept d=parsedept( dept);
		LocalDate date=parsedate( joindate);
		
		
		
		
		return new Employee(id, fn, lname, d, date, salary);
	}
	
	
	
	
	public static LocalDate parsedate(String date) throws EmpExceptn {
		LocalDate d=LocalDate.parse(date);
		int da=Period.between(d, LocalDate.now()).getYears();
		if(da>3)
			throw new EmpExceptn("invalid joindate");
		
		return d;
	}
	
	
	public static Dept parsedept(String d) {
		return Dept.valueOf(d.toUpperCase());
		
	}
	
	
	public static String chkdup(String fname,Map<Integer,Employee> emap) throws EmpExceptn {
		Employee e=new Employee(fname);
		if(emap.containsValue(e))
			throw new EmpExceptn("Dup name");
		return fname;
		
		
		
	}
	
	

}
