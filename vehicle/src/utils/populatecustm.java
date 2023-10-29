package utils;

import static utils.CustomerValRules.validate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import classes.Customer;
import vechilexcepn.CustomerExceptn;

public class populatecustm {

	public static List<Customer> populatelist() throws CustomerExceptn {
		List<Customer> clist = new ArrayList<>();
		clist.add(validate("virat", "kholi ", "abc@gmail.com", "pass123", 1000, "2000-01-01", "silver", clist));
		clist.add(validate("ms", "dhoni", "abdc@gmail.com", "qwe123", 2000, "2000-01-01", "gold", clist));
		clist.add(validate("hardik", "pandya", "abyc@gmail.com", "oiu123", 10000, "1997-01-01", "platinium", clist));
		clist.add(validate("sharuk", "khan", "aubc@gmail.com", "qwee123", 1000, "1998-01-01", "silver", clist));
		clist.add(validate("amir", "khan", "ablc@gmail.com", "oiu123", 5000, "2001-01-01", "diamond", clist));
		return clist;

	}
	
	public static Map<String,Customer> populatemap(List<Customer> culist) throws CustomerExceptn {
		Map<String,Customer> cmap = new HashMap<>();
		
		for(Customer c:culist) 
			cmap.put(c.getEmail(), c);
			
		System.out.println("Size:" +cmap.size());
		
		
		
		return cmap;
	
	}

}
