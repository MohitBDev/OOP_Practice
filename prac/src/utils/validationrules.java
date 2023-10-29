package utils;

import java.time.LocalDate;

import customException.EmpException;
import entiities.Employee;

public class validationrules {
	
	public static Employee validate( String firstname, String lastname, String joiningdate, double salary) throws EmpException {
		
		LocalDate date1=validatedate(LocalDate.parse(joiningdate));
		
		return new Employee(firstname, lastname, joiningdate, salary);
		
	}

	public static LocalDate validatedate(LocalDate date) throws EmpException {

		LocalDate startdate = LocalDate.parse("2020-01-01");
		if (date.isAfter(startdate))
			return date;
		else
			throw new EmpException("Invalid Joining Date");

	}

}
