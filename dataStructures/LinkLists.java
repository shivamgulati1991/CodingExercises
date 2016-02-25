package dataStructures;

import java.util.LinkedList;

public class LinkLists {
	LinkedList<Integer> l = new LinkedList<Integer>();
	void deleteList(int value){
		int i=0;
		while(!l.isEmpty()){
			if(l.get(i)==value){
				l.remove(i);
				break;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkLists ll=new LinkLists();
		ll.l.add(3);
		ll.l.add(4);
		ll.l.add(4);
		ll.l.add(5);
		System.out.println(ll.l);
		ll.deleteList(4);
		System.out.println(ll.l);
	}

}
