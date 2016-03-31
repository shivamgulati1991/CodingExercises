package othersamples;

public class ArrayHopper {
	static void hopArray(int [] arr){
		int len=arr.length;
		int currPos=0,nextIndex,max=0,maxi=0;
		while(currPos<=len){
			System.out.println(currPos);
			for(int i=1;i<=arr[currPos];i++){
				
				if(arr[max]<arr[currPos+arr[currPos+i]]){
					max=currPos+arr[currPos+i];
					maxi=currPos+i;
				}
				System.out.println("i"+maxi+"max"+currPos+arr[currPos+i]);
			}
			
			currPos=max;
			max=0;
			maxi=0;
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2 , 4 , 1 , 2 , 3 , 2 , 4 , 2};
		hopArray(arr);
	}

}
