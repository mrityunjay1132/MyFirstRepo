package TrangleMissingPattern;
//while doing this type of program first make table like sachin sir

public class MissingPattern2 
{
	public static void main(String[] args) 
	{
		int lines=5;
		int starCount=1;
		int spaceCount=2;
		int mid=(lines+1)/2;
		 
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spaceCount;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=starCount;k++)
			{
				if(k==1 || k==starCount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<mid)
			{
				spaceCount--;
				starCount=starCount+2;
			}
			else
			{
				spaceCount++;
				starCount=starCount-2;
			}
		}                                                     
	}
}
