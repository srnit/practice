package p2;
class protection2 extends p1.protection
{
	protection2()
	{
		System.out.println("derived other package constructor");
		//class or package onlly
		//System.out.println("n="+n);
		//class only
		//System.out.println("n_pri="+n_pri);
		System.out.println("n_pro="+n_pro);
		System.out.println("n_pub="+n_pub);
		


	}
}

