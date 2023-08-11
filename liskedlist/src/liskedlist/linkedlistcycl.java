package liskedlist;

import liskedlist.LList.Node;

//import liskedlist.LList.Node;

class linkedlistcycl {
	   Node1 Head;

	public static class Node1{
		Node1 head;
		int data;
		Node1 next;
		Node1(int data){
			this.data=data;
			this.next =null;
			
		}
		
	}
	
	public static boolean detectcycle(Node1 Head) {
	    Node1 slow ,fast ;
	    slow = fast = Head;
	    while(fast.next != null) {
	    	slow=slow.next;
	    	fast= fast.next.next;
	    	if(fast == slow) {
	    		return true;
	    	}
	    }
		return false;
	}
	
	 void addfirst(int a) {
		 Node1 newnod=new Node1(a);
		
		if(Head==null) {
			 Head=newnod;
			 return;  
		 }
		 newnod.next=Head;
		 Head =newnod;
	 }
	 void addlast(int a) {
		 Node1 newnod=new Node1(a);
		 Node1 curnode;
		 if(Head==null) {
			 Head = newnod;
			 return;
		 }
		 curnode=Head;
		 while(curnode.next!=null) {
			 curnode=curnode.next;
		 }
		 curnode.next=newnod;
	 }
	 
	 void printll() {
		 Node1 currnode=Head;
		 while(currnode!=null) {
			 System.out.print(currnode.data +" ->");
			 currnode=currnode.next;
		 }
		 System.out.println("null");
	
	 }
	public static void main(String[] args) {
		Node1 a= new Node1(5);
		Node1 b= new Node1(2);
		Node1 c= new Node1(1);
		Node1 d= new Node1(3);
		Node1 e= new Node1(8);
		linkedlistcycl abc = new linkedlistcycl();
		
		abc.addfirst(8);
		abc.addlast(10);
		abc.addlast(9);
		a.next =b;
		b.next =c;
		c.next=d;
		d.next= e;
		e.next = b;
		boolean ab = detectcycle(a);
		
		System.out.println(" the answe is  "+ ab);
		
	}

 
}
