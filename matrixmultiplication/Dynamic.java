package matrixmultiplication;

class Dynamic{
	static int m[][] = new int[15][15];
	static int dynamicMatrix(int[] p){
		int i,k,q,j,l;
		int n=p.length-1;
		for (i=1;i<=n;i++)
		{
			m[i][i]=0;
		}
		for (l=2;l<=n;l++)
		{
			for (i=1;i<=n-l+1;i++)
			{
				j=i+l-1;
				m[i][j]=Integer.MAX_VALUE;	//set as max value
			
			for (k=i;k<=j-1;k++)
			{
				q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
				if (q<m[i][j])
						{
							m[i][j]=q;
						}
			}
			}
		}
		return m[1][n];						//return multiplications
	}
public static void main(String args[])
{
	long st,ft,total;
	int answer;
	st=System.nanoTime();
	int p[]={5,2,4,3,7,9,7,8,6,1,3,7,6,5};
	answer=dynamicMatrix(p);
	ft=System.nanoTime();
	total=ft-st;				//calculate time
	System.out.println("Minimum number of scalar multiplications are " + answer);
	System.out.println("Runtime in nano " + total);
}
}