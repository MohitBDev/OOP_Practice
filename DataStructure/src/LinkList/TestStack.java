package LinkList;

public class TestStack {

	public static void main(String[] args) throws Exception {
	stack s=new stack(5);
	System.out.println(s.isEmpty());
	s.push(4);
	s.push(3);
	s.push(2);
	s.push(1);
	s.push(0);

    s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
//	s.pop();

	System.out.println(s.isFull());
System.out.println(s.isEmpty());


	}

}
