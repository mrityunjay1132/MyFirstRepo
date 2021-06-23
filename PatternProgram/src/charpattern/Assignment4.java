package charpattern;

public class Assignment4
{
	public static void main(String[] args) 
	{
		int lines=5;
		int charCount=1;
		int spaceCount=3;
		char ch='A';
		int mid=(lines+1)/2;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);	
			}

			for(int k=1;k<spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch);

			}

			System.out.println();
			if(i<mid)
			{
				spaceCount--;
				charCount++;	
			}
			else
			{
				spaceCount++;
				charCount--;
			}
		}
	}
}
