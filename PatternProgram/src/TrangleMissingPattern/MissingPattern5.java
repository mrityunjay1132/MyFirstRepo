package TrangleMissingPattern;


/*
    *                 
   * *     ===>     
  *   *          
 *     *   
********* 

*/
public class MissingPattern5 
{
	public static void main(String[] args)
	{
		int lines=5;
		int starCount=1;
		int spaceCount=4;
		for(int i=1;i<=lines;i++)
		{
			for (int j=1;j<=spaceCount;j++)
			{
				System.out.print(" ");
			}

			for (int j=1;j<=starCount;j++)
			{
				if(j==1 || j==starCount || i==lines)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
			starCount=starCount+2;
			spaceCount--;
		}
	}
}
