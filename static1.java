class Static1
{
	Static1( int x)
	{
		static2 ob3=new static2(10);

      System.out.println("this is constructor"+x);
	}
	public static void display(int y)
	{
		System.out.println("this is a static function"+y);
	}
	  class Static2
	{
	 Static2(int x)
	{
		System.out.println("this is constructor"+x);
		//display(50);
		
	}
int fun()
		{System.out.println("statc 2");}

}
}
class static3
{
	public static void main(String args[])
	{
		Static1 ob2=new Static1(20);
		Static1.display(50);
		Static1.Static2 r=Static1.Static2();
		r.fun();
		//ob2.static2 ob4= new ob2.static2(3)   
//ob2.fun();

	}
}
