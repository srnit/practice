package p1;
interface I1
{
	int meth1(int a);
	int meth2();
}
interface I2 extends I3
{
	int meth3();
}
class a implements I2
{//the method must be public note:method---->defined in interface;
	public int meth1(int a)
	{
		System.out.println("this is meth1");
		System.out.println(a);
	} 
	public int meth2(int a)
	{
		System.out.println("this is meth2");
        System.out.println(a);
	}
	public int meth3(int a)
	{
		System.out.println("this is meth2");
        System.out.println(a);
	}
}
public class itest
{
	public static void main(String args[])
	{
		a ob1=new a();
		ob1.meth1(10);
		ob1.meth2(20);
		ob1.meth3(30);

	}
}