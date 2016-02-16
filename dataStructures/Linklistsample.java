package dataStructures;

import java.util.LinkedList;

public class Linklistsample {
static LinkedList<String> list=new LinkedList<String>();
static LinkedList<String> list1=new LinkedList<String>();

public static void main(String args[]){
	list.add("1");
	list.add("2");
	list.add("3");
	list1.add("4");
	list1.add("5");
	list1.add("6");
	int c=0;
	for(String s:list){
		for(String s1:list1){
			if(s==s1){
				System.out.println("Found");
				c=1;
				break;
			}
		}
			
	}
	if (c==0){
		System.out.println("Not found");
	}
}


}
