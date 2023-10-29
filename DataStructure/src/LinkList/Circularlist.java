package LinkList;

public class Circularlist {

	public static void main(String[] args) throws Exception {
		CircularLinkList cll=new CircularLinkList();
		cll.addFirst(4);
		cll.addFirst(3);
		cll.addFirst(2);
		cll.addFirst(1);
		cll.addFirst(0);
		cll.addLast(5);
		cll.addLast(6);
		cll.addPos(3, 4);
		cll.deleteFirst();
		cll.deleteLast();
		cll.deleteAtPos(4);
		cll.display();

	}

}
