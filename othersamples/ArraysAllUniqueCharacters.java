package othersamples;

import java.util.HashMap;

public class ArraysAllUniqueCharacters {
	//n2 time
	/*static void checkUnique(String input){
			int c=0;
		for(int i=0;i<input.length();i++){
			for(int j=i+1;j<input.length();j++){
				if(input.charAt(i)==input.charAt(j)){
					System.out.println("Not unique");
					c=1;
					break;
				}
			}
		}
		if (c==0){
			System.out.println("Unique");
		}
	}*/
	
	//O(n) complexity
	static void checkUnique(String input){
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		int c=0;
		for(int i=0;i<input.length();i++){
			if(!(hs.containsKey(input.charAt(i)))){
			hs.put(input.charAt(i), 1);
			}
			else{
				c=1;
				System.out.println("Not unique");
				break;
			}
		}
		if (c==0){
			System.out.println("Unique");
		}
}
public static void main(String[] args){
	String input="abacd";
	checkUnique(input);
}
}
