package othersamples;

public class MaxSubarray {

	static int MaxSum(int[] input){
		int newsum=input[0];
		int max=input[0];
		for(int i=1;i<input.length;i++){
			newsum=Math.max(newsum+input[i], newsum);
			max=Math.max(max, newsum);
		}
		return max;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,-4,3,10,-2};
		System.out.println(MaxSum(a));
	}

}
