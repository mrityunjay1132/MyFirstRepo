package charpattern;

public class CharPattern4
{
	public static void main(String[] args)
	{
		int lines=5;
		int charCount=5;
		char char1='E';
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				if(j==1 || j==charCount|| i==1||i==lines)
				{
				System.out.print(char1);
			}
		
			else
			{
				System.out.print(" ");
			}
				char1--;
			}
			System.out.println();
			char1='E';
		}
	}
}
