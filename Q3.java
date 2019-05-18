
public class Q3 {

	public static void main(String[] args) {
		long n=600851475143l;
		int i=2;
		while (i<=n)
		{
			if (n%i==0)
			{
				n=n/i;
				System.out.println("Greatest prime factor :"+i);
			}
			i++;
		}
}}
