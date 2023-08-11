package liskedlist;

import liskedlist.LList.Node;
	

public class cycleinlist {
	public static boolean detectcycle(Node head) {
		    Node slow ,fast ;
		    slow = fast = head;
		    while(fast.next != null) {
		    	slow=slow.next;
		    	fast= fast.next.next;
		    	if(fast == slow) {
		    		return true;
		    	}
		    }
			return false;
		}
	public static void main(String[] args) {
		LList list = new LList();
		list.addlast("my");
		list.addlast("name");
		list.addlast("is");
		list.addlast("vaibhav");
		list.addlast("name");
		boolean a = detectcycle(list.head);
		
		System.out.println("" + a);
		

	}

	
}
