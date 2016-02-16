package othersamples;


public class StringPermutation {
	public static void main(String[] args){
	String a="hell";
	String b="ehll";
	
	char[] a1=a.toCharArray();
	char[] b1=b.toCharArray();
	java.util.Arrays.sort(a1);
	java.util.Arrays.sort(b1);
	String a2=new String(a1);
	String b2=new String(b1);
	if(a2.equals(b2)){
		System.out.println("Yes, permutation");
	}
	else
		System.out.println("No, not a permutation");
}
}