package NumberPattern;

public class NumPattern1 
{
	public static void main(String[] args) 
	{
	int lines=5;
	int numCount=5;
	int num=1;
	for(int i=1;i<=lines;i++)
	{
		for(int j=1;j<=numCount;j++)
		{
			System.out.print(num++);
		}
		num=1;
		System.out.println();
	}
	}
}
