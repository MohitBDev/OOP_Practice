package LinkList;



public class CircularLinkList {
	
	Node head;

	public CircularLinkList() {

		this.head = null;
	}

	static class Node {

		int data;
		Node next;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
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
		}

	}

	public void addFirst(int d) {
		Node nn = new Node(d);
		if(head==null) {
			head=nn;
			nn.next=head;
		
		}
	
			Node trav=head;
			while(trav.next!=head) {
				trav=trav.next;
			}
			nn.next=head;
			trav.next=nn;
			head=nn;
			
			
		
		
	

	}

	public void display() {
		if(head==null) {
			return;
		}
		Node trav = head;
		
		do {
			System.out.print(trav.data+" -> ");
			trav=trav.next;
			
		}while(trav!=head);

	}

	public void addLast(int d) {
		Node nn = new Node(d);
		Node trav = head;
		while (trav.next != head) {
			trav = trav.next;
		}
          nn.next=head;
		trav.next = nn;
		if (head == null) {
			head = nn;
			nn.next=head;
		}

	}

	public void addPos(int d, int pos) {

		Node nn = new Node(d);
		Node trav = head;
		if (head == null || pos == 1) {
			addFirst(d);

		}
		for (int i = 1; i < pos - 1; i++) {
			if (trav.next == null) {
				break;
			}
			trav = trav.next;
		}

		nn.next = trav.next;
		trav.next = nn;

	}

	public void deleteAll() {
		head.next=null;
		head = null;
	}

	public void deleteFirst() throws Exception {
		if (head == null) {
			throw new Exception("List is Empty");

		}
		Node trav=head;
		while(trav.next!=head) {
			trav=trav.next;
		}
		trav.next=head.next;
		head=head.next;

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
