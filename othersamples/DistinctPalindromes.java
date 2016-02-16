package othersamples;

import java.util.HashSet;
import java.util.Set;

public class DistinctPalindromes {
	
	//get palindrome total count
/*	static int getPalindromeCount(String input){
		Set<String> set=new HashSet<String>();
		for(int i=0;i<input.length();i++){
			for(int j=i+1;j<=input.length();j++){
				if(chkPalin(input.substring(i, j))){
					set.add(input.substring(i, j));
				}
			}
		}
		return set.size();	
	}
	
	//check palindrome
	static boolean chkPalin(String input){
		if(input.length()>0){
		for(int i=0,j=input.length()-1;i<=j;i++,j--){
			if (!(input.charAt(i)==input.charAt(j))){
				return false;
			}
		}
		return true;
		}
		return false;
	}*/
	
	static int getPalindromeCount(String str){
		int check=0;
		Set<String> set=new HashSet<String>();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				if(str.length()>0){
					for(int m=i,n=j-1;m<=n;m++,n--){
						if (!(str.charAt(m)==str.charAt(n))){
							check=1;
							break;
						}
					}
					if(check==0){
						set.add(str.substring(i, j));
					}
					check=0;
					}
			}
		}
		return set.size();	
	}
	

public static void main(String[] args){
	System.out.println(getPalindromeCount("aabaa"));
}
}
