package othersamples;

import java.util.HashMap;

public class CommonElements {

	static void findCommon(int[] arr1,int[] arr2){
		int i,j;
		HashMap<Integer,Integer> elements= new HashMap<Integer,Integer>();
		for(i=0;i<arr1.length;i++){
			elements.put(arr1[i], 1);
		}
		for(j=0;j<arr2.length;j++){
			if(elements.containsKey(arr2[j])){
				System.out.println(arr2[j]);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,6,5,2,4};
		int[] b={7,3,5,6,9};
		findCommon(a,b);
		}
}
