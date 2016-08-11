class pattern
{
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print(".");
             if(j==i)
             {
             	for(int k=i;k<10;k++)
             		System.out.print(".");
             	 System.out.println();
             }
             System.out.println();
                
	}}}
}