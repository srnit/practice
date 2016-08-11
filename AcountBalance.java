package bankapp;
public class AcountBalance
{
	//public int a;
	//public String name;
	private int a;
     private  String name;
	public AcountBalance( String s,int b)
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