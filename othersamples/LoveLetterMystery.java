package othersamples;

import java.util.Scanner;

public class LoveLetterMystery {

	static int loveLetter(String input){
		int count=0,temp=0;
		for(int i=0,j=input.length()-1;i<=j/2;i++,j--){
				if(input.charAt(i)>input.charAt(j)){
					temp=input.charAt(i)-input.charAt(j);
				}
				else if (input.charAt(i)<input.charAt(j)){
				temp=input.charAt(j)-input.charAt(i);
				}
					count+=temp;
		}
		return count;
	}
	
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        String k=sc.next();
	System.out.println(loveLetter(k));
        }
}
}
