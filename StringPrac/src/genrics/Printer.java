package genrics;

public class Printer<T> {
	T val;
	
	public Printer(T val) {
		this.val=val;
		
	}
	
	public void prints() {
		System.out.println(this.val);
	}

}
