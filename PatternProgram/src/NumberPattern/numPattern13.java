package NumberPattern;

public class numPattern13 
{
	public static void main(String[] args)
	{
		int lines=5;
		int numCount=1;
		int num=1;
		int spaceCount=3;
		int mid=(lines+1)/2;
	for(int i=1;i<=lines;i++)
	{
		for(int k=1;k<spaceCount;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=numCount;j++)
		{
			System.out.print(num);
		}
		
		if(i<mid)
		{
			spaceCount--;
			numCount++;
		}
		else
		{
			spaceCount++;
			numCount--;
		}
		System.out.println();
	}
	}
}
