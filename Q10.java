public class Q10 {

	public static void main(String[] args) {
		long a=2;
for (long i=3;i<2000000;i++)
{
	int b=0;
	for (int j=2;j<=Math.sqrt(i);j++)
	{
		if (i%j==0)
		{
			b=1;
			break;
		}
	}
	if (b==0)
	{
		a=a+i;
	}
}
System.out.println("Sum required:"+a);
}
}
