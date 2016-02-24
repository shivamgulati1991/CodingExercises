package dataStructures;

class Node{
	int data;
	Node next;
	
	public Node(int d){
		data=d;
	}
}
public class CustomLinkList {
	Node first;
	
	public CustomLinkList(){
		first=null;
	}
	
	public boolean isEmpty(){
		return first==null;
	}

	public void insertFirst(int d){
		Node node=new Node(d);
		node.next=first;
		first=node;
	}
	public void insertLast(int d){
		Node n=first;
		Node newNode=new Node(d);
		if(first==null){
			newNode.next=first;
			first=newNode;
		}
		else{
			while(n.next!=null){
				n=n.next;
			}
			n.next=newNode;
		}
	}
	
	public void deleteFirst(){
		//Node temp=first;
		first=first.next;
	}
	public void deleteAny(int d){
		Node n=first;
		while(n!=null){
			if(n.data==d){
				n=n.next;
				n.next=n.next.next;
				break;
			}
			else
			n=n.next;		
		}

		
	}
	public void deleteLast(){
		Node n=first,prev=null;
		while(n.next!=null){
			prev=n;
			n=n.next;
		}
		prev.next=null;
	}

	public void printList(){
		Node node=first;
		while(node!=null){
		System.out.println(node.data);
		node=node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkList c=new CustomLinkList();
		c.insertLast(2);
		c.insertLast(5);
		c.insertLast(3);
		System.out.println("list: ");
		c.printList();
		c.deleteAny(5);
		System.out.println("list: ");
		c.printList();
		
	}

}
