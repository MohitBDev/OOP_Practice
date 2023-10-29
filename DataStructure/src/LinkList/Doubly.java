package LinkList;

public class Doubly {

	public static void main(String[] args) throws Exception {
		DoublyLinkList dll	= new DoublyLinkList();
		dll.addFirst(4);
		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.addFirst(0);
		dll.addLast(5);
		dll.addPos(3, 3);
		dll.deleteFirst();
		//dll.deleteAll();
		dll.display();
		

	}

}
