package p1;
class derived extends protection
{
	derived()
	{
		System.out.println("derived constructor");
		System.out.println("n="+n);
		//class only
		//System.out.println("n_pri="4+n_pri);
		System.out.println("n_pub="+n_pub);
		System.out.println("n_pro ="+n_pro);
	}
}