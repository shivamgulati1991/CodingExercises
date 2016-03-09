package othersamples;

import java.util.Scanner;
import java.util.Stack;

public class StackBrackets {

	
	public static String chkBrackets(String input){
		Stack<Character> stack=new Stack<Character>();
		char temp;
		int j=0;
		for(int i=0;i<input.length();i++){
			temp=input.charAt(i);
			if(temp=='(' ||temp=='{' || temp=='[' || temp=='<'){
				stack.push(temp);
			}
			if(temp==')' ||temp=='}' || temp==']' || temp=='>'){
				if(stack.isEmpty())
					return "NO";
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
				else if(temp=='>' && last=='<'){
					stack.pop();
				}
				else return "NO";
			}
		}
		if (stack.isEmpty()) 
			return "YES";
		else
			return "NO";
	}
	
/*	public static String[] chkBrackets(String[] values){
		Stack<Character> stack=new Stack<Character>();
		String[] output=new String[values.length];
		char temp;
		int j=0;
		for(int m=0;m<values.length;m++){
		for(int i=0;i<values[m].length();i++){
			temp=values[m].charAt(i);
			if(temp=='(' ||temp=='{' || temp=='[' || temp=='<'){
				stack.push(temp);
			}
			if(temp==')' ||temp=='}' || temp==']' || temp=='>'){
				if(stack.isEmpty()){
					output[m]= "NO";
					break;
				}
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
				else if(temp=='>' && last=='<'){
					stack.pop();
				}
				else{
						output[m]= "NO";
						break;
				}
			}
		}
		if (stack.isEmpty()) 
			output[m]= "YES";
		else
			output[m]= "NO";
		while(!(stack.empty()))
			stack.pop();
		}
	}*/
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int res=sc.nextInt();
		for(int i=0;i<res;i++){ 
			String input=sc.next();
		System.out.println(chkBrackets(input));
		}
	}
}
