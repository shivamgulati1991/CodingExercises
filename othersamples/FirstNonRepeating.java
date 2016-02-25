package othersamples;

import java.util.HashMap;

public class FirstNonRepeating {

	static char nonRepeating(String input){
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char c;
		for(int i=0;i<input.length();i++){
			c=input.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
		}
			else{
				map.put(c, 1);
			}
		}
		
		for(int i=0;i<input.length();i++){
			c=input.charAt(i);
			if(map.get(c)==1){
				return c;
			}
		}
		return '\0';
	}
	public static void main(String[] args){
		String input="Hhello";
		char c=nonRepeating(input.toLowerCase());
		System.out.println(c);
	}
}
