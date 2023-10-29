package LinkList;

public class Singly {

	public static void main(String[] args) throws Exception {
		
		SinglyLinkList sll=new SinglyLinkList();
		sll.addFirst(4);
		sll.addFirst(3);
		sll.addFirst(2);
		sll.addFirst(1);
	
		sll.addLast(5);
		sll.addFirst(0);
		sll.addPos(3,4);
		sll.deleteFirst();
		sll.deleteLast();
		sll.deleteAtPos(4);
		sll.reverse();
		sll.display();
		
		

	}

}
