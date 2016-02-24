package othersamples;
import java.util.ArrayList;

public class DeleteDuplicates {

	 void deleteDup(int[] input){
		ArrayList<Integer> out =new ArrayList<Integer>();
		for(int i=0;i<input.length;i++){
			if(!(out.contains(input[i]))){
				out.add(input[i]);
			}
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteDuplicates d=new DeleteDuplicates();
		int[] input={1,3,3,11,3,4,2,1,2,2,7};
		d.deleteDup(input);
	}

}
