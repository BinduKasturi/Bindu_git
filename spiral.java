import java.io.*;
public class spiral
{
	static void ff(int[][] a,int x,int y,int p,int f)
	{
		for(int i=x;i<=y;i++)
		{
			if(f==0)
				System.out.print(a[i][p]+" ");
			else
				System.out.print(a[p][i]+" ");
		}
	}
	static void FF(int[][] a,int x,int y,int p,int f)
	{
		for(int i=x;i>=y;i--)
		{
			if(f==0)
				System.out.print(a[i][p]+" ");
			else
				System.out.print(a[p][i]+" ");
		}
	}
	public static void main(String[] z)
	{
		int[][] a={{1,2,3,4},
				   {12,13,14,5},
				   {11,16,15,6},
				   {10,9,8,7}};
		int fr=0,fc=0,lr=3,lc=3;
		while(fr<=lr&&fc<=lc)
		{
			ff(a,fc,lc,fr,1);fr++;
			ff(a,fr,lr,lc,0);lc--;
			FF(a,lc,fc,lr,1);lr--;
			FF(a,lr,fr,fc,0);fc++;
		}
	}
}
