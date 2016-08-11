package bankapp;
import java.util.Scanner;
class balanceover
{
	public static void main(String[]args)
	{
		int avilabale=5000;
		//int withdrow=60000;
        Scanner in=new Scanner( System.in);
        System.out.println("enter the amount you want to withdrow");
      int  webal=in.nextInt();
       try
       {
       if(webal>avilabale)
       {
       	throw new ArithmeticException("insufficient balance");
       }
       	 System.out.println("traction completed");
       
   }
       catch(ArithmeticException e)
       {
         System.out.println("Exception :"+e.getMessage());

       }
   
      


	}
}