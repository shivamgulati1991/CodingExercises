package dataStructures;

import java.util.ArrayList;

public class SimpleString {
	static ArrayList<String> string=new ArrayList<String>();
	static ArrayList<String> string1=new ArrayList<String>();
	static StringBuilder sentence=new StringBuilder();

	public static void main(String args[]){
		//string.add("Hello");
		//string.add("Hi");
		for(int i=0;i<5;i++){
			string.add("hey");
		}
		for(int i=0;i<5;i++){
			string1.add("hi");
		}
		for(String w:string){
			sentence.append(w);
		}
		System.out.println(sentence);
	}
}
