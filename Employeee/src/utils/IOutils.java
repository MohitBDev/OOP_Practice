package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import classs.Employee;

public interface IOutils {
	
	
	static void store(String filename,Map<Integer,Employee> emap) throws IOException {
		
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(emap);
			
			
		}
	}
	
	
@SuppressWarnings("unchecked")
static Map<Integer,Employee> restore(String filename) throws IOException, ClassNotFoundException {
		
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))) {
			
			return (Map<Integer,Employee>)in.readObject();
			
		}
}
}
