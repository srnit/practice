package exception;
class NesTry
{
	public static void main(String args[])
	{
		int a=args.length;
		try
		{
		int b=1/a;
		System.out.println("a:"+a);
		try
		{
		if(a==1)
		{
			int d=2/(a-1);
		}
		if(a==2)
		{
			int c[]={1};
			c[42]=99;

		}
	}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds"+e);

		}
	}
catch(ArithmeticException e)
{
System.out.println("arithmetic exception"+e);
}
}
}