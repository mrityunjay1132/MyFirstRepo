package charpattern;

public class CharPattern3 
{
	public static void main(String[] args)
	{
		int lines=5;
		int charCount=5;
		char char1='A';
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				if(j==1 || j==charCount || i==1||i==lines) //j->for 1st and last char in each row 
				{
				System.out.print(char1);
			}
		
			else
			{
				System.out.print(" ");
			}
				char1++;
			}
			System.out.println();
			char1='A';
		}
	}
}
