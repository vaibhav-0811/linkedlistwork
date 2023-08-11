package liskedlist;
import  liskedlist.linkedlistcycl.Node1;

public class mergetwosortedlist {
	
	static void display(Node1 head) {
		Node1 cpy = head;
		while(cpy != null) {
			System.out.print(cpy.data + " -> ");
			cpy = cpy.next;
		}
		System.out.println("null");
		
	}
	
	public static void mergell(Node1 Heada , Node1 Headb ) {    
		Node1 temp1 = Heada , temp2 = Headb ;
	//	System.out.println(temp1.next.data);
		//Node1 newlist = new Node1(100);
		//linkedlistcycl newlist = new linkedlistcycl();
		//newlist.addfirst(1);
		Node1 newlist = new Node1(1);
	 	Node1 temp = newlist.head;
	//	linkedlistcycl newlist = new linkedlistcycl();
		while(temp1!=null && temp2 != null) {
			if(temp1.data< temp2.data) {
				Node1 ab =new Node1(temp2.data);
				temp.next = ab;
				temp = ab;
				if(temp1 == null) break;
				temp1=temp1.next;
			}
			if(temp2.data<= temp1.data) {
				Node1 ab =new Node1(temp1.data);
				temp.next = ab;
				temp = ab;
				if(temp2 == null)  break;
				temp2=temp2.next;
			}
		}
		System.out.println("  line    ");
		if(temp1 == null)
			temp.next = temp2;
		else
			temp.next=temp1;
		
		display(newlist.head.next);
	}

	public static void main(String[] args) {
		Node1 a = new Node1(1);
		Node1 b = new Node1(3);
		Node1 c = new Node1(5);
		Node1 d = new Node1(7);
		Node1 e = new Node1(9);
		a.next = b; b.next=c; c.next = d; d.next= e; // this first list
		display(a);
		Node1 v = new Node1(2);
		Node1 i = new Node1(4);
		Node1 j = new Node1(6);
		Node1 k = new Node1(8);
		Node1 l = new Node1(10);
		v.next = i; i.next =j; j.next = k; k.next = l;
		mergell(a,v);
		
		
	 //	linkedlistcycl list = new linkedlistcycl();
		//list.addfirst(10);
	//	list.addfirst(8);
		//list.addfirst(6);
	//	list.addfirst(4);
	//	list.addfirst(2);     //  this is second list 
	//	list.printll();
	//	linkedlistcycl listmerge = new linkedlistcycl();
	//	listmerge.Head = mergell(a , list.Head);
	//	listmerge.printll();
	}

}
