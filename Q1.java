import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int i,sum=0;
		for (i=1;i<n;i++)
		{
			if (i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
System.out.println(sum);
	}

}
