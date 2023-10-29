package utils;

import java.time.LocalDate;

import java.time.Period;
import java.util.List;

import classes.Customer;
import classes.ServicePlan;
import vechilexcepn.CustomerExceptn;

public class CustomerValRules {
	
	
	public static Customer validate(String fname, String lname, String email, String password, double regamt, String dob,String plan,List<?> list) throws CustomerExceptn {
		String e= dupemail(email,list);
		ServicePlan p=valregamt( regamt, plan);
		LocalDate d=parsedate( dob);
		chkage(d);
		
		
		
		System.out.println("Customer added");
		
		
		
		
		return new Customer(fname, lname, e, password, regamt, d, p);
		
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static ServicePlan valregamt(double reg,String plan) throws CustomerExceptn {
	 ServicePlan pl=parseplan(plan);
			if(pl.getPrice()!=reg)
				throw new CustomerExceptn("Invalid Price ");
			return pl;
		
	}
	
	
	

	public static void chkage(LocalDate d) throws CustomerExceptn {
		int age = Period.between(d, LocalDate.now()).getYears();
		System.out.println(age);
		if (age < 21)
			throw new CustomerExceptn("you are under age ");

	}

	public static LocalDate parsedate(String da) {

		return LocalDate.parse(da);
	}

	public static ServicePlan parseplan(String pl) {
		return ServicePlan.valueOf(pl.toUpperCase());

	}

	public static String dupemail(String email, List<?> list) throws CustomerExceptn {
		
	
		if (list.contains(new Customer(email)))
			throw new CustomerExceptn("duplicate email ");
		return email;

	}
	
	public static Customer login(String email,String pass,List<Customer> list) throws CustomerExceptn {
		int index =list.indexOf(new Customer(email));
		if(index==-1)
			throw new CustomerExceptn("Wrong email ");
		Customer c=list.get(index);
		if(!c.getPassword().equals(pass))
			throw new CustomerExceptn("Wrong pass ");
		return c;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
