class command
{
	static void vargs(int...v)
	{
		for(int i=0;i<v.length;i++)
		{
			System.out.print(v[i]+" ");
		}
	}
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
		vargs(10,20,200,300);
		vargs();
	}
}