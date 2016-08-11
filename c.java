class final1
{
	int a,b;
	final int area(int a,int b)
	{
      return a*b;
	}
}
class b extends final1
{
	int area1(int a)
	{	
		return a;

	}
}
class c
{
	public static void main(String args[])
	{
		b ob1 =new b();
		System.out.println(ob1.area(10,20));
	}
}