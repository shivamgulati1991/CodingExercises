package matrixmultiplication;

class Recursive{
	static int m[][] = new int[15][15];
	static int rec=0;
	static int recursiveMatrix(int[] p,int i,int j){
		int k,q;
		rec=rec+1;		//increase recursive call
		if (i==j)		//base case
				return 0;
		m[i][j]=Integer.MAX_VALUE;  //setup to max value
		for (k=i;k<=j-1;k++)
		{
			q=recursiveMatrix(p,i,k)+recursiveMatrix(p,k+1,j)
			+ p[i-1]*p[k]*p[j];		//recursive call
			
			if (q < m[i][j])
					m[i][j]=q;
		}
		return m[i][j];
	}
public static void main(String args[])
{
	long st,ft,total;
	int answer;
	st=System.nanoTime();
	int p[]={5,2,4,3,7,9,7,8,6,1,3,7,6,5};
	answer=recursiveMatrix(p,1,13);
	ft=System.nanoTime();
	total=ft-st;				//calculate time
	System.out.println("Minimum number of scalar multiplications are " + answer);
    System.out.println("Number of recursive calls are " + rec);
	System.out.println("Runtime is " + total);
}
}