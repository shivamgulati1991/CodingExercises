package othersamples;

import java.util.Stack;

public class StackBrackets {

	
	
	public static boolean chkBrackets(String input){
		Stack<Character> stack=new Stack<Character>();
		char temp;
		int j=0;
		for(int i=0;i<input.length();i++){
			temp=input.charAt(i);
			if(temp=='(' ||temp=='{' || temp=='['){
				stack.push(temp);
			}
			if(temp==')' ||temp=='}' || temp==']'){
				if(stack.isEmpty())
					return false;
				char last=stack.peek();
				if(temp==')' && last=='('){
					stack.pop();
				}
				else if(temp=='}' && last=='{'){
					stack.pop();
				}
				else if(temp==']' && last=='['){
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		String input="((()){}{{}}[{}])";
		System.out.println(chkBrackets(input));
	}
}
