package liskedlist;

import liskedlist.LList.Node;

// find intersection of two linked list ?
// step 1 - find the length of both linked list
// step 2- increase the head position by difference of both list size =(m-n) where m is size of bigger linked list 
	
	
public class LLoperations {
	//   Node head;
	//class Node {
		//Node head;
	//	String data;
	//	Node next;
	//	Node(String data){
	//		this.data=data;
	//		this.next=null;
	//	}
//	}
		
	/*	void addfirst(String a) {
			 Node newnode=new Node(a);
			 if(head==null) {
				 head=newnode;
				 return;  
			 }
			 newnode.next=head;
			 head =newnode;
		 }
		 void addlast(String a) {
			 Node newnod=new Node(a);
			 Node curnode;
			 if(head==null) {
				 head = newnod;
				 return;
			 }
			 curnode=head;
			 while(curnode.next!=null) {
				 curnode=curnode.next;
			 }
			 curnode.next=newnod;
		 }
		 
		 void display() {
			 if(head==null) {
				 System.out.println("the list is empty ");
				 return;
			 }
			 Node currnod =head;
			 while(currnod!= null) {
				 System.out.print(currnod +" --> ");
				 currnod=currnod.next;
			 }
			 System.out.println("null");
			 
		 }
		 
		 
		 

		*/
		
	
	public static void getintersection(Node headA , Node headb) {
		Node temp1=headA;
		Node temp2=headb;
		int sizeA=0;
		int sizeB=0;
		while(temp1!=null) {
			sizeA++;
			temp1=temp1.next;
		}
		while(temp2!=null) {
			sizeB++;
			temp2=temp2.next;
		}
		System.out.println(sizeA);
		System.out.println(sizeB);
		
		temp1=headA;
		temp2=headb;
	//	System.out.println(temp1.next.data);
	//	System.out.println(temp2.next.data);
		int step;
		
		if(sizeA > sizeB) {
			step=sizeA - sizeB;
		//	System.out.println(step);
			for(int i=1;i<=step;i++) {
				temp1=temp1.next;
			}
			System.out.println(temp1.data);
		}
		else
		{
			 step=sizeB - sizeA;
		for(int i=1;i<=step;i++) {
				temp2=temp2.next;
			}
			System.out.println(temp2.data);
		}
		while(temp1.data != temp2.data && temp1 != null) {
			temp1=temp1.next;
			//System.out.println(temp1.data);
			temp2=temp2.next;
			//System.out.println(temp2.data);
		}
		
		System.out.println("the intersection point is :="+ temp1.data);
	}
	

	public static void main(String[] args) {
		LList list = new LList();
		list.addfirst("my");
		list.addlast("name ");
		list.addlast("is");
		list.addlast("vaibhav");
		list.printlist();
		LList list2 = new LList();
		list2.addfirst("this");
		list2.addlast("is");
		list2.addlast("vaibhav");
		list2.printlist();
		
	    getintersection(list.head , list2.head);
		


	}
}
