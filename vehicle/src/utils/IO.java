package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import classes.Customer;

public interface IO {
	
	
	
	@SuppressWarnings("unchecked")
	static Map<String,Customer> restore(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream in= new ObjectInputStream(new FileInputStream(filename)))
		{
			return (Map<String,Customer>)in.readObject();
			
		}
		
	}
	
	static void store(String filename,Map<String,Customer> emap) throws FileNotFoundException, IOException {
		
		
		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename)))
		{
		out.writeObject(emap);
			
		}
		
	}

}
