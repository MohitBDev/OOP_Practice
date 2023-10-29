package LinkList;

public class stack {
	int[] arr;

	int top;

	public stack(int size) {
		super();
		this.arr = new int[size];

		this.top = -1;
	}

	public void push(int d) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is Full ");
			
		}
		top++;
		arr[top] = d;

	}

	public int peek() {

		return arr[top];

	}

	public void pop() throws Exception {
if(isEmpty()) {
	throw new Exception("Stack is Empty");
		}

		top--;

	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;

	}

}
