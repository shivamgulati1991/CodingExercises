package matrixmultiplication;

class Memoized{
	static int m[][] = new int[10][10];
	static int rec=0;
	//static int p[]={2,4,5,4,5,5,5,4,3};
	static int p[]={2,4,5,4,5,5,5,4,3};
	static int memoizedMatrix(int[] p){
		int n=p.length-1;
		int i,j;
		for (i=1;i<=n;i++)
		{
			for (j=i;j<=n;j++)
			{
				m[i][j]=Integer.MAX_VALUE; //setup to max value
			}
		}
		return lookup(m,p,1,n);
	}
	
	static int lookup(int[][]m,int[] p,int i, int j ){
		rec=rec+1;		//increase recursive call
		int k,q;
		if(m[i][j]<Integer.MAX_VALUE)
				return m[i][j];
		if (i==j)		//base case
				m[i][j]= 0;
		else{		
			for (k=i;k<=j-1;k++)
			{
				q=lookup(m,p,i,k)+lookup(m,p,k+1,j) + p[i-1]*p[k]*p[j];		//recursive call
				if (q < m[i][j])
						m[i][j]=q;
			}
		}
		return m[i][j];
	}

public static void main(String args[])
{
	long st,ft,total;
	int answer;
	
	st=System.nanoTime();
	
	answer=memoizedMatrix(p);
	ft=System.nanoTime();
	total=ft-st;				//calculate time
	System.out.println("Minimum number of scalar multiplications are " + answer);
    System.out.println("Number of recursive calls are " + rec);
	System.out.println("Runtime is " + total);
}
}