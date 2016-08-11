class static1
{
	static1( int x)
	{
		static2 ob3=new static2(10);
      System.out.println("this is constructor"+x);
	}
	public static void display(int y)
	{
		System.out.println("this is a static function"+y);
	}
	class static2
	{
	 static2(int x)
	{
		System.out.println("this is constructor"+x);
		display(50);
	}
}
}
class static3
{
	public static void main(String args[])
	{
		static1 ob2=new static1(20);
		static1.display(50);
	}
}