package liskedlist;
import liskedlist.LList.Node;

// with one time traversal 
// delete nth node from the end 
// turtle rabit method 
// 

public class nthnodefromend {
	
	public static  Node traversenth(Node head , int n ) {
		Node slow ;
		Node fast ;
		slow=fast=head;
		for (int i = 1;i<=n;i++) {
			fast=fast.next;
		}
		if(fast==null) {
			System.out.println("the size of list is "+ n);
			head = head.next;
			return head ;
		}
		else {
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;
				
		return head;
	}
}
	

	public static void main(String[] args) {
		LList list = new LList();
		list.addfirst("a");
		list.addfirst("is");
		list.addfirst("this");
		list.addlast("linkedlist");
		list.printlist();
		list.head =traversenth(list.head , 4);              // head return hua to apn ne list.head m us head ko store kiya
		 list.printlist();
		
	
	}
}
