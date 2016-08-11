package interface1;
interface myif

{
	int getnumber();
	default String getstring()
	{
		return "default string";
	}
}
class a implements myif
{
  public int getnumber()
  {
  	return 100;
  }
  //public String getstring()
  //{
  //	return "this is not default string";
 // }
  

}
public class A{
public static void main(String arg[])
{
	myif m1=new a();
   System.out.println(m1.getstring());
    System.out.println(m1.getnumber());
   
  
}
}