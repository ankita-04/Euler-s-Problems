
public class Q3 {

	public static void main(String[] args) {
		
		long n=600851475143L;
		boolean k=true;
		int i=2,fact=1;
		for ( ;i<n;i++)
		{
			if (n%i==0 ){
				for (int j=2;j<i;j++)
				{
					if (i%j==0)
					{
						k=false;
					}
				}
				if (k){
					System.out.println(i);
				}
			}
			
	}

}}
