package LinkList;

public class DoublyLinkList {
	Node head;

	public DoublyLinkList() {

		this.head = null;
	}

	static class Node {

		int data;
		Node next;
		Node prev;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	public void addFirst(int d) {
		Node nn = new Node(d);
		if (head == null) {
			head = nn;

		}
		else {

		nn.next = head;
		if (head != null) {
		    head.prev = nn;
		}
		head = nn;
	
		}

	}

	public void display() {
		if (head == null) {
			return;
		}
		Node trav = head;
		while (trav!= null) {
			System.out.print(trav.data + " ->");
			trav = trav.next;
			
		}

	}

	public void addLast(int d) {
		Node nn = new Node(d);
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}
		nn.prev=trav;
		trav.next=nn;

	}

	public void addPos(int d, int pos) {

		Node nn = new Node(d);
		Node trav = head;
		Node temp=null;
		if (head == null || pos == 1) {
			addFirst(d);

		}
		for (int i = 1; i < pos ; i++) {
			if (trav.next == null) {
				break;
			}
			
			trav = trav.next;
		}
        nn.prev=trav.prev;
        
		nn.next = trav;
		trav.prev.next=nn;
		trav.prev=nn;
		

	}

	public void deleteAll() {
		head.next.prev=null;
		head.next = null;
		
		head = null;
	}

	public void deleteFirst() throws Exception {
		if (head == null) {
			throw new Exception("List is Empty");

		}
	head=head.next;
	head.prev.next=null;
	head.prev=null;
		
		

	}

	public void deleteLast() {
		Node trav = head;
		Node del = null;
		while (trav.next != head) {
			del = trav;
			trav = trav.next;

		}
		del.next = head;

	}

	public void deleteAtPos(int pos) {

		Node trav = head;
		Node del = null;
		if (head == null || pos == 1) {

		}
		for (int i = 1; i < pos; i++) {
			if (trav.next == null) {
				deleteLast();
			}
			del = trav;
			trav = trav.next;
		}
		del.next = trav.next;

	}

}
