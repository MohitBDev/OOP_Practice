package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MakeCopy {

	public static void main(String[] args) throws IOException {
		File ifile=new File("/Users/apple/Downloads/untitled text 2.txt");
		File ofile=new File("/Users/apple/Downloads/abc.txt");
		int i=0;
		FileInputStream fi=null;
		FileOutputStream fo=null;
		
		
		try {
			 fi=new FileInputStream(ifile);
			 fo=new FileOutputStream(ofile);
			 System.out.println(fi.available());
			while((i=fi.read())!=-1) {
				//System.out.print((char)i);
				fo.write(i);
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("done");
			if(fi!=null) {
				fi.close();
			}
			if(fo!=null) {
				fo.close();
			}
		}
		
		
		
		

	}

}
