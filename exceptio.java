package exception;
import java.util.Random;
class exception
{
	public static void main(String [] args)
	{
		int a,b,c;
		a=b=c=0;
	Random r=new Random();
for(int i=0;i<1000;i++)
{
try {
a=r.nextInt();
b=r.nextInt();
c=999/(a/b);
System.out.println("this will not execute");
}

catch (ArithmeticException e)
{
System.out.println("error occuer divison by occur");
a=0;
}

System.out.println("a:"+a);
}
}
}
