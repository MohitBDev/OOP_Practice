package LinkList;

public class Circularqquee {

	public static void main(String[] args) throws Exception {
		cqueue cq=new cqueue(5);
		cq.push(4);
		cq.push(3);
		cq.push(2);
		cq.push(1);
		cq.push(0);
		cq.pop();
//		cq.pop();
//		cq.pop();
//		cq.pop();
//		cq.pop();
	System.out.println(cq.peek());
	System.out.println(cq.isEmpty());
	System.out.println(cq.isFull());
		

	}

}
