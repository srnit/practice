package p2;
class otherpackage
{
	otherpackage()
	{
	p1.protection p=new p1.protection();
	System.out.println("other package constructor");
	//class only or package only 
	//System.out.println("n="+p.n);
	//class only
	//System.out.println("n_pri="+p.n_pri);
	//class, subclass or package only
	System.out.println("n_pub="+p.n_pub);
} 
}