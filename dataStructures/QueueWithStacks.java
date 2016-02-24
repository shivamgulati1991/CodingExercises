package dataStructures;
/*
 * Queue using 2 stacks
 */
import java.util.Stack;

public class QueueWithStacks {
	Stack<Integer> in=new Stack<Integer>();
	Stack<Integer> out=new Stack<Integer>();
	
	public void insert(int d){
		in.push(d);
	}
	public int delete(){
		if(out.isEmpty()){
			while(!(in.isEmpty())){
				out.push(in.pop());
			}
		}
		return out.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueWithStacks q=new QueueWithStacks();
		q.insert(3);
		q.insert(5);
		q.insert(6);
		System.out.println(q.delete());
		System.out.println(q.delete());

	}

}
