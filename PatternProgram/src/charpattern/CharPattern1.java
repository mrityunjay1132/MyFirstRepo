package charpattern;

public class CharPattern1
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
			System.out.print(char1++);
		}
		System.out.println();
		char1='A';
	}
}
}
