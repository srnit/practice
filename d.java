class a
{
	int a;
}
 final class b extends a{//error show bz we cant inherit a class which declare as final
 	
int c;
}
class e extends b{

}
class d
{
	public static void main(String args[])
	{
      b ob1=new b();
	}
}