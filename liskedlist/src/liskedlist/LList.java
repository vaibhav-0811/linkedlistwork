package liskedlist;


public class LList {
	Node head;
    class Node
    {
   	 String data;
   	 Node next;
   	 
   	 Node(String data)
   	 {
   		 this.data=data;
   		 this.next=null ;
   	 }
//   	 void addfit(String a) {
//		 Node newnode=new Node(a);
//		 if(head==null) {
//			 head=newnode;
//			 return;  
//		 }
//		 newnode.next=head;
//		 head =newnode;
//	 }

    }
	 void addfirst(String a) {
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
	 
	 void printlist() {
		 if(head==null) {
			 System.out.println("the list is empty ");
		 }
		 Node currnode=head;
		 while(currnode!=null) {
			 System.out.print(currnode.data +" ->");
			 currnode=currnode.next;
		 }
		 System.out.println("Null");
	 }
	 
	 void deletefirst() {
		 if(head==null) {
		 System.out.println("list is empty ");
		 }
		 head=head.next;
	 }
	 
	 void deletelast() {
		 if(head==null) {
			 System.out.println("list is empty ");
			 }
		 Node currnode = head;
		 Node lastnode = head.next;
		 while(lastnode.next!=null) {
			 lastnode=lastnode.next;
			 currnode=currnode.next;
		 }
		 currnode.next=null;
	 }


	public static void main(String[] args) {
		  LList list=new LList();
		  list.addfirst("a");
			list.addfirst("is");
			list.addfirst("this");
			list.addlast("linked");
			list.addlast("list");
			list.printlist();
	//		list.addfit("A");     can't call node class method with LList class object 

			list.deletefirst();
			list.printlist();
			list.deletelast();
			list.printlist();
	}

}
