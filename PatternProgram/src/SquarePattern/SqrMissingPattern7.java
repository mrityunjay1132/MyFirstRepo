package SquarePattern;

public class SqrMissingPattern7 
{
	public static void main(String[] args)
	{
	int lines=5;
	int starCount=5;
	int mid=(lines+1)/2;
	for(int i=1;i<=lines;i++)
	{
		for(int j=1;j<=starCount;j++)
		{
			if( i==1 || i==lines || j==mid)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}
