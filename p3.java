class p3
{
	public static void main(String args[])
	{
	String mystring1="sudhanshu";
	String mystring2="raman";
	String mystring3=mystring1+" "+mystring2;
	String mystring4[]={"one","two","three","four"};
	System.out.println(mystring3);
	int l=mystring3.length();
	int m=mystring2.length();
	if(m==l)
	{
		System.out.println("equal length");

	}
	char c=mystring2.charAt(3);
	if(c=='a')
		System.out.println(" right");
	for(int i=0;i<4;i++)
	{
		System.out.println("mystring4["+i+"]:"+mystring4[i]);
	}
}

}