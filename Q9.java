
public class Q9 {

	public static void main(String[] args) {
		int s=1000;
		int a;
		int p=0;
		for (a=1;a<=s/3;a++)
		{
			int b;
			for (b=a+1;b<=s/2;b++)
			{
				int c=s-a-b;
				if (c>0 && (a*a+b*b==c*c))
				{
					System.out.println(a+" "+b+" "+c);
					p=a*b*c;
				}
			}
			
		}
		System.out.println(p);
	}

}
