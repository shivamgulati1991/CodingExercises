package othersamples;

public class SayWhatYouSee {
	
	static String saywhatyousee(String input){
	int size=input.length();
	String j="";
	int count=1,i;
	int chr='\0';
	for(i=1;i<input.length();i++){
		chr=input.charAt(i);
		if(chr==input.charAt(i-1)){
			count++;
		}
		else{
			//System.out.println(j);
			j=j+count+input.charAt(i-1);
			count=1;
		}			
	}
	j=j+count+input.charAt(i-1);
	return j;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="1114466221";
		System.out.println(saywhatyousee(input));
	}

}
