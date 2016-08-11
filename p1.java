class 2djavamatrix
{
	public static void main(String args[])
	{
		int mat[][]=new int[3][5];
		for(int i=0;i<3;i++)
		{
     			for(int j=0;j<5;j++)
     			{
     				mat[i][j]=i*j;
     			}


		}
		///desplayng content and there sum;
		for(int i=0;i<3;i++)
			for(int j=0;j<5;j++)
			{
				System.out.println("value at"+i+j+mat[i][j]);
			}
	}
}