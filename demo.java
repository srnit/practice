class demo
{
	private int l,b,h;
	public void  dimension(int l,int b,int h)
	{
		System.out.println("l="+l);
		System.out.println("b="+b);
		System.out.println("h="+h);

	}


	public static void  main(String args[])
	{
		demo demo1=new demo();
		demo1.dimension(12,20,30);
	}

}