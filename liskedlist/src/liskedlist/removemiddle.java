package liskedlist;
import liskedlist.LList.Node;

public class removemiddle {
	
	   public static Node deletemiddle(Node head) {
		   Node slow,fast;
		   slow=fast=head;
		   if(   head.next ==null && head.next.next==null) {
			   System.out.println("this list don't have middle element");
			   return head;
		   }
			   while(fast.next.next!=null && fast.next.next.next != null) {
				   
				   slow= slow.next;
				   fast=fast.next.next;
			   }
			   slow.next=slow.next.next;	 
		   return head;
	   }

	public static void main(String[] args) {
		LList list = new LList();
		//LList list2 = new LList();
		
		list.addfirst("mishra");
		list.addfirst("vaibhav");
		list.addfirst("is");
		list.addfirst("this");
		
		list.addlast("IT engineer");
	//	list.addlast("IT engineer");
		list.printlist();
		list.head=deletemiddle(list.head);
		list.printlist();

		

	}

}
