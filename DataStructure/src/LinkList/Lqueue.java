package LinkList;

public class Lqueue {
	int[] arr;
	int r;
	int f;
	
	
	
	public Lqueue(int size) {
		super();
		this.arr = new int[size];
		this.r = -1;
		this.f = -1;
	}

	public void push(int d) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full ");
			
		}
		r++;
		arr[r] = d;

	}

	public int peek() {

		return arr[f+1];

	}

	public void pop() throws Exception {
if(isEmpty()) {
	throw new Exception("Stack is Empty");
		}

		f++;

	}

	public boolean isFull() {
		return r == arr.length - 1;
	}

	public boolean isEmpty() {
		return f==r;

	}


}
