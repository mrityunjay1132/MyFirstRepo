package charpattern;

public class CharPattern6 
{
	public static void main(String[] args) 
	{
		int lines=5;
		int charCount=1;
		char ch='A';
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=charCount;j++)
			{
				System.out.print(ch++);
			}
			ch='A';
			charCount++;
			System.out.println();
		}
	}
}
