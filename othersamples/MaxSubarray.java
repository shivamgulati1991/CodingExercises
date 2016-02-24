package othersamples;

public class MaxSubarray {

	static int MaxSum(int[] input){
		int newSum=input[0];
		int max=input[0];
		for(int i=1;i<input.length;i++){
			newSum=Math.max(newSum+input[i], newSum);
			max=Math.max(max, newSum);
		}
		return max;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,-4,3,10,-2};
		System.out.println(MaxSum(a));
	}

}
