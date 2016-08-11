class a
{
	double dim1;
	double dim2;
	a(double a,double b)
	{
		dim1=a;
		dim2=b;
		System.out.println("Area for figure is undefined");
	}
	double area()
	{
		System.out.println("Area for figure is undefined");
		return 0;
	}
}
class rect extends a{
	rect(double a,double b)
	{
		super(a,b);
		System.out.println("Area for figure is unkjbgdefined");
	}
int a,b;
}

class tri extends rect{
	tri(double a,double b)
	{
		super(a,b);
	}
}
class c
{
	public static void main(String args[])
	{
		tri ob=new tri(10,20);
	}
}