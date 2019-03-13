import java.math.BigInteger;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BigInteger sum=new BigInteger("2");
boolean k=true;
for (int i=3;i<2000000;i++)
{
	double a=Math.sqrt((double)i);
	for (int j=2;j<=a;j++)
	{
		if (i%j==0)
		{
			k=false;
			break;
		}}
		 if (k)
		{
			sum=sum.add(BigInteger.valueOf(i));
		}
		 k=true;
	}

System.out.println(sum);
	}

}
