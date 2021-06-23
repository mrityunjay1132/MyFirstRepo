package NumberPattern;

public class numPattern9
{
	public static void main(String[] args) 
	{
		int lines=5;
		int numCount=1;
		int num=5;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=numCount;j++)
			{
				System.out.print(num--);
			}
			num=5;
			numCount++;
			System.out.println();
		}
	}
}
