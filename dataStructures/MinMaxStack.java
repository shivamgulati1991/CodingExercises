package dataStructures;
/*
 * Get the min value of stack with continuous push and pop
 * Max implementation similar but not implemented
 * Using Stack package of Java
 */
import java.util.Stack;

public class MinMaxStack {
	
	public static void push(Stack<Integer> stack,Stack<Integer> min, int value){
		
		if(min.isEmpty()){
			stack.push(value);
			min.push(value);
		}
		else if(value>min.peek()){
			min.push(min.peek());
			stack.push(value);
		}
		else{
			stack.push(value);
			min.push(stack.peek());
		}
	}
	public static void pop(Stack<Integer> stack,Stack<Integer> min){
		
		stack.pop();
		min.pop();
	}
	public static int getmin(Stack<Integer> min){
		return min.peek();
		
	}
		
public static void main(String[] args){
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	push(stack,min,4);
	push(stack,min,2);
	push(stack,min,6);
	push(stack,min,5);
	System.out.println(min.peek());
	pop(stack,min);
	System.out.println(min.peek());
}
}
