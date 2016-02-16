package othersamples;

import java.util.LinkedList;
import java.util.Scanner;

public class IsItPossible {
	

	public static int gcd(int num1, int num2) { 
		if(num2 == 0){ 
			return num1; 
			} 
		return gcd(num2, num1%num2); 
		}
	public static String isItPossible(int a, int b, int c, int d){
        if(gcd(c,d)==gcd(a,b))
            return "YES";
        else
        	return "NO";
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
	    for(int i=0;i<x;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			System.out.println(isItPossible(a,b,c,d));
	    }
		
	}

}
