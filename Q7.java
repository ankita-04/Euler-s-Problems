import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
	int n,status=1,num=3,count,j;
	
	int N=10001;
	if (N>=1)
	{
		System.out.println("First"+N+"prime numbers are :");
		System.out.println(2);
	}
for (count=2;count<=N;)
{
	for (j=2;j<=Math.sqrt(num);j++)
	{
		if (num%j==0)
		{
			status=0;
			break;
		}
	}
	if (status!=0)
	{
		System.out.println(num); 
		count++;
	}
	status=1;
	num++;
}
	}

}
