package othersamples;

import java.util.Arrays;

public class MergeSortedArrays {

	static void mergeArrays(int[] array1, int[] array2){
		int i=0,j=0,k=0;
		int[] ans=new int[array1.length+array2.length];
		
		while(i<array1.length && j<array2.length){
			if(array1[i]>array2[j]){
				ans[k]=array2[j];
				j++;
			}
			else{
				ans[k]=array1[i];
				i++;
			}
			
			k++;
		}
		while(i<array1.length){
			ans[k]=array1[i];
			
			i++;
			k++;
		}
		while(j<array2.length){
			ans[j]=array2[i];
			
			j++;
			k++;
		}
	for(i=0;i<ans.length;i++){
		System.out.println(ans[i]);
	}
	}
	public static void main(String[] args){
		int[] a={2,4,7,8,10};
		int[] b={1,4,5,6};
		mergeArrays(a,b);
		
	/*	int a=782;
		int b=a,digits=0;
		while (a>0){
			a=a/10;
			digits++;
		}
		System.out.println(b/digits);*/
		
		
		
	}
}
