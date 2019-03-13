
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0,sum2=0,diff,i,j,k;
		for( i=1 ;i<=100;i++)
		{
		 j=((int)Math.pow(i,2));
			sum1=sum1+j;
		}
				System.out.println("sum of the squares="+sum1);
			
		for ( k=1;k<=100;k++)
		{
			sum2=sum2+k;
			
		}
		sum2=sum2*sum2;
				System.out.println(sum2);
			    
				diff=sum2-sum1;
			
					System.out.println(diff);
	}

}
