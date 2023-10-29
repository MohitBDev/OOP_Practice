package LinkList;

public class Linearqueue {

	public static void main(String[] args) throws Exception {
		Lqueue q=new Lqueue(5);
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		q.pop();
		q.pop();
		q.pop();
		q.pop();
	
	System.out.println(q.peek());
	System.out.println(q.isEmpty());
	System.out.println(q.isFull());
	

	
	}

}
