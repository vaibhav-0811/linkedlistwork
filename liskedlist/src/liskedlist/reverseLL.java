package liskedlist;
import liskedlist.linkedlistcycl;
import liskedlist.linkedlistcycl.Node1;;
 
public class reverseLL {
	public static Node1 reversell(Node1 head) {
		if (head.next == null)  return head;
		
		Node1 newhead = reversell(head.next);
		head.next.next = head;
		head.next = null;	
		return newhead;
	}

	public static void main(String[] args) {
		linkedlistcycl list = new linkedlistcycl();
		list.addfirst(20);
		list.addfirst(21);
		list.addfirst(22);
		list.addfirst(23);
		list.addfirst(24);
		list.addfirst(27);
		list.printll();
		list.Head = reversell(list.Head);
		list.printll();
	}

}
 