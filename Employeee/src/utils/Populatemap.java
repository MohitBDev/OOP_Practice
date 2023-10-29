package utils;

import java.util.HashMap;
import java.util.Map;

import EmplyExceptn.EmpExceptn;

import static utils.EmployeeValidationRules.*;

import classs.Employee;

public class Populatemap {
	//id,  fname, lname, dept, joindate, double sa
	//(enum : RND,HR,SALES,FINANCE,PRODUCTION)
	public static Map<Integer,Employee> poulate() throws EmpExceptn{
		
		Map<Integer,Employee> emap= new HashMap<>();
		emap.put(100, validate(100, "virat", "kholi", "rnd", "2022-01-01",10000 , emap));
		emap.put(101, validate(101, "ms", "dhoni", "hr", "2022-01-01",104000 , emap));
		emap.put(102, validate(102, "hardik", "pandya", "sales", "2022-01-01",100500 , emap));
		emap.put(103, validate(103, "rohit", "sharma", "finance", "2022-01-01",100300 , emap));
		emap.put(104, validate(104, "sharuk", "khan", "production", "2022-01-01",105000 , emap));
		
		
		
		return emap;
		
		
		
		
	}
	

}
