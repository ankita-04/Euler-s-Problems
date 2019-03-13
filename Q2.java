
public class Q2 {

	public static void main(String[] args) {
		int a=0,b=1,n=4000000,sum=0,c=0;
		
		while ( c<4000000){
			c=a+b;
			a=b;
			b=c;
			if (c%2==0)
			{
			sum=sum+c;
			}
		
		}
		System.out.println(sum);}}

	


