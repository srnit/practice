class overrloaddemo1
{
	void test()
	{
	System.out.println("no prameter");
}
	void test(double a)
	{
	System.out.println("valuse"+a);}
	double test(int a,double b)
	{
	return a*b;}

	}
	class overrloaddemo
	{
		public static void main(String args[]) {
			overrloaddemo1 ob1=new overrloaddemo1();
			ob1.test();
			ob1.test(10);
			ob1.test(20.2);
			double result;
			result=ob1.test(10,20.0);
			System.out.println(result);
			
		}
	}