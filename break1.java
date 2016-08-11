 class break1
{
	//public static void main(String args[])
	public static void main(String args[])
	{
		first:
		{
		second:
		{
		third:
		{
			for(int i=0;i<12;i++)
	{			if(i==10)
					break second;

                   System.out.println(i);
				}

		}
	}
		System.out.println("out from second and third label");
	}
}
}