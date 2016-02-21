package othersamples;

public class StringCompression {

	static void getCompressedString(String input){
		String result="";
		int count=1;
		for(int i=1;i<input.length();i++){
			
			if(input.charAt(i)==input.charAt(i-1)){
				count++;
			}
			else{
				result=result+ input.charAt(i-1)+Integer.toString(count);
				System.out.println(result);
				count=1;
			}	
		}
		result=result+ input.charAt(input.length()-1)+Integer.toString(count);
		System.out.println(result);
	}
	public static void main(String[] args){
		String input="aaabbccdef";
		getCompressedString(input);
	}
}
