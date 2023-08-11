package liskedlist;
import liskedlist.LList.Node;

public class middleelement {
		public static Node middleelmnt(Node head) {
			Node slow;
			Node fast;
			slow=fast=head;
			while(fast.next.next != null && fast.next != null) { // for left middle
				                                                // fast != null for right middle
				// && ki condition m hmesa pehli condition check hoti h agar vo false h
				//o age check nhi krta --->> fast.next != null && fast != null ye condition m
				// pehle jb fast.next  != null check hua or null ke age nikal gya to error aa gya 
				slow=slow.next;
				fast=fast.next.next;
			}
			
			return slow;
		}
	public static void main(String[] args) {
		LList list = new LList();
		LList list2 = new LList();
		
		list.addfirst("mishra");
		list.addfirst("vaibhav");
		list.addfirst("is");
		list.addfirst("this");
		
		list.addlast("IT engineer");
		list.addlast("IT engineer");
		list.printlist();
		list2.head = middleelmnt(list.head);
		System.out.println("the middle element of list is ="+list2.head.data);

	}

}
