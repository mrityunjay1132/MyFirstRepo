package NumberPattern;

public class NumPattern6
{
public static void main(String[] args) 
{
	int lines=5;
	int numCount=1;
	int num=1;
	for(int i=1;i<=lines;i++)
	{
		for(int j=1;j<=numCount;j++)
		{
			System.out.print(num);
		}
		numCount++;
		System.out.println();
	}
}
}
