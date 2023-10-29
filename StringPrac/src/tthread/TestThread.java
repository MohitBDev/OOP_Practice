package tthread;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		//ThreadClass t1=new ThreadClass();
	//	ThreadClass t2=new ThreadClass();
		RunaableDemo th =new RunaableDemo() ;
		Thread t3=new Thread(th);
		//t3.start();
		t3.run();
		
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			
		}
			
			
		
	
        
	}

}
