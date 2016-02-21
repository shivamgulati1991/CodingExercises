package dataStructures;

import java.util.Stack;


public class CustomStack {
	Stack<Integer> min;
	int data;
	CustomStack next;
	/*public CustomStack(int data){
		this.data=data;
	}*/
	CustomStack top;
	
	public int pop(){
		int item=top.data;
		top=top.next;
		return item;
	}
	
	public void push(int item){
		//CustomStack c=new CustomStack(item);
		CustomStack c=new CustomStack();
		c.data=item;
		//if(top==null){
			//min.push(item);
		//}
		//else
		//{
			if(item<min.peek()){
				//min.pop();
				min.push(item);
			}
		//}
		c.next=top;
		top=c;
	}

	public int peek(){
		return top.data;	
	}
	
	public boolean isEmpty(){
		if (top==null)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStack cs = new CustomStack();
		cs.push(3);
		cs.push(4);
		cs.push(5);
		System.out.println(cs.peek());
		cs.pop();
		System.out.println(cs.peek());
	}

}
