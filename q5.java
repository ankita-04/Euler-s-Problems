
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c;
for (i=1; ;i++)
{
	c=0;
	for (j=1;j<=20;j++)
	{
		if (i%j!=0)
		{
			break;
		}
		else
		{
			c++;
		}
	}
	if (c==20)
	{
		System.out.println(i);
		break;
	}

}
System.out.println(i);
	}

}
