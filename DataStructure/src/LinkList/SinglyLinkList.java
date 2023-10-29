package LinkList;

public class SinglyLinkList {
	Node head;

	public SinglyLinkList() {

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
		nn.next = head;
		head = nn;

	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}

	}

	public void addLast(int d) {
		Node nn = new Node(d);
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}

		trav.next = nn;
		if (head == null) {
			head = nn;
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
		head = null;
	}

	public void deleteFirst() throws Exception {
		if (head == null) {
			throw new Exception("List is Empty");

		}
		Node trav = head;
		head = trav.next;
		trav.next = null;

	}

	public void deleteLast() {
		Node trav = head;
		Node del = null;
		while (trav.next != null) {
			del = trav;
			trav = trav.next;

		}
		del.next = null;

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


//	public Node Reverse(Node head) {
//		Node curr=head;
//		Node prev=null;
//		while(curr!=null) {
//			Node temp=curr.next;
//			curr.next=prev;
//			prev=curr;
//			curr=temp;
//			
//		}
//		return prev;
//		
//	}
	
	public Node Reverse(Node h) {
		if(h ==null || h.next==null) {
			head =h;
			return h;
			
		}
		Node temp=Reverse(h.next);
		Node headnext=h.next;
		headnext.next=h;
		h.next=null;
		return temp;
		
		

	}
	public void reverse() {
		Node prev=Reverse(head);
		head=prev;
		
		
	}

}
