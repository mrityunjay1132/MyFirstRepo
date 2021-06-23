package NumberPattern;

public class numPattern10 
{
	public static void main(String[] args) 
	{
		int lines=5;
		int numCount=1;
		int num=1;
		int spaceCount=4;
		/*
-----------------------------------------------------------------		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=numCount;j++)
			{
				System.out.print(num);
			}
			spaceCount--;
			numCount=numCount+2;
			System.out.println();
		}
		
---------------------------------------------------------------------------------		
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=numCount;j++)
			{
				System.out.print(num);
			}
			num++;
			spaceCount--;
			numCount=numCount+2;
			System.out.println();
		}
---------------------------------------------------------------------------------------		
		*/
		for(int i=1;i<=lines;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=numCount;j++)
			{
				System.out.print(num++);
			}
			num=1;
			spaceCount--;
			numCount=numCount+2;
			System.out.println();
		}
	}
}
