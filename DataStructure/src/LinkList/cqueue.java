package LinkList;

public class cqueue {
	int[] arr;
	int max;
	int r;
	int f;
	
	
	public cqueue(int size) {
		super();
		this.arr = new int[size];
		this.max=arr.length;
		this.r = -1;
		this.f = -1;
	}
	
	public void push(int d) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full ");
			
		}
		r=(r+1) % max;
		arr[r] = d;

	}

	public int peek() {
		int index=(f+1)%max;
		return arr[index];

	}

	public void pop() throws Exception {
if(isEmpty()) {
	throw new Exception("Stack is Empty");
		}

		f=(f+1)%max;
		if(f==r) {
			f=-1;
			r=-1;
		}

	}

	public boolean isFull() {
		return ((f==-1 && r == max - 1 )|| (f==r && f!=-1));
	}

	public boolean isEmpty() {
		return (f==r && f==-1);

	}
	
	

}
