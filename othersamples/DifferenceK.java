package othersamples;

import java.util.HashMap;

public class DifferenceK {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		
		arr[0]=1;
		arr[1]=5;
		arr[2]=6;
		arr[3]=10;
		int k=4;
		int count = 0;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], 0);
		}
		
		for(int j=0; j<arr.length; j++)
		{
			if(map.containsKey(arr[j]+k))
				count++;
		}
		
		System.out.println(count);
	}

}
