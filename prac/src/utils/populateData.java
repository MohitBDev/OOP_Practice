package utils;

import static utils.validationrules.*;


import java.util.HashMap;
import java.util.Map;

import customException.EmpException;
import entiities.Employee;

public class populateData {
	
public static Map<Integer,Employee> populate() throws EmpException{
	Map<Integer,Employee> emap= new HashMap<>();
	emap.put(1, validate("virat", "kholi",  "2023-01-01",10000 ));
	emap.put(2, validate( "ms", "dhoni",  "2023-01-01",104000 ));
	emap.put(3, validate( "hardik", "pandya",  "2022-01-01",100500 ));
	emap.put(4, validate( "rohit", "sharma",  "2021-01-01",100300 ));
	emap.put(5, validate( "sharuk", "khan",  "2021-01-01",105000 ));
	
	return emap;
		
	
}

}
