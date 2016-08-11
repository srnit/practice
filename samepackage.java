package p1;
class samepackage
{
	samepackage()
	{
		protection p= new protection();
		System.out.println("samepackage constructor");
		System.out.println("n="+p.n);
       //class only
		//System.out.println("n_pri="+p.n_pri);
		System.out.println("n_pro="+p.n_pro);

	}
}
