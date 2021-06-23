//while doing this type of program first make table like sachin sir


package TrangleMissingPattern;

public class MissingPatter1
{
	public static void main(String[] args) 
	{
		int lines=5;
		int starCount=1;
		int spaceCount=2;
		int mid=(lines+1)/2;

		for(int i=1;i<=lines;i++)
		{
			for(int l=1 ; l<=spaceCount;l++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{

				if(j==1 || j==starCount)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			if(i<mid)
			{
				starCount++;
				spaceCount--;
			}
			else
			{
				starCount--;
				spaceCount++;
			}
			System.out.println();
		}
	}
}
