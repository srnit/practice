package bankapp;
public class AcountBalance
{
	int a;
	String name;
	AcountBalance( String s,int b)
	{
      a=b;
      name=s;
	}
	public void test( int c)
	{
		if(c>a)
		{
			System.out.println("insufficent balance");

		}


	}
}