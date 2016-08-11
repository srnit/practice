class box
{
	private int width,length,height;
	 box()
	{
		width=1;
		length=1;
		height=1;
	

	}
	 box(int w,int l,int h)
	{
		width=w;
		length=l;
		height=h;
		 
	}
	public  int volume()
	{
		return width*height*length;

	}

}
class constructor1
{
	public static void main(String args[])
	{
      box ob1=new box();
      
      System.out.println("volume"+ob1.volume());
      box ob2=new box(10,20,30);
      System.out.println("volume"+ob2.volume());

	}
}