package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		File file=new File("/Users/apple/Downloads/untitled text 2.txt");
		BufferedReader br=null;
		int i=0;
		try {
			 br=new BufferedReader(new FileReader(file));
			 while((i=br.read())!=-1) {
				 System.out.print((char)i);
				 
				 
			 }
			 
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
