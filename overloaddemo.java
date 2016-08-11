class overloaddemo1
{
	void test()
	{
	System.out.println("no prameter");
}
	void test(int a)
	{
	System.out.println("valuse"+a);}
	float test(int a,float b)
	{
	return a*b;}

	}
	class overrloaddemo
	{
		public static void main(String[] args) {
			overrloaddemo ob1=new overrloaddemo();
			ob1.test();
			ob1.test(10);
			float result;
			result=ob1.test(10,20.0);
			System.out.println(result);
			
		}
	}