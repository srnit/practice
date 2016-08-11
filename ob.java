class test
{
	private int a,b;
	test(int i,int j)
	{
		a=i;
		b=j;
	}
	test(test o)
	{
		a=o.a;
		b=o.b;
	}
	public boolean check(test o)
	{
		if(o.a==a&&o.b==b)
			return true;
		else
			return false;
	}
}
class equalto
{
	public static void main(String args[])
	{
		test ob1=new test(1,2);
		test ob2=new test(ob1);
		boolean t;
		t=ob1.check();
		if(t==true)
			System.out.println("equal objects");
		else
			System.out.println(" notequal objects");
	}
}