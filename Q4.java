
public class Q4 {

	public static void main(String[] args) {
		int i,j,k=0,l=0,m=0,n=0,flag=0;
		
		for (i=999;i>=100;i--)
		{
			
			for (j=999;j>=100;j--)
			{
				k=i*j;
				System.out.println(k);
				m=0;
				n=k;
				while (n>0)
				{
					l=n%10;
					m=m*10+1;
					n=n/10;
				}
				if (m==k)
				{
					System.out.println(k+" "+i+" "+j);
					flag=1;
					break;
				}}
			if (flag==1)
			{
				System.out.println(k);
				break;
			}
		
			
	}}}

