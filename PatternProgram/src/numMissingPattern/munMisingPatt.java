package numMissingPattern;

public class munMisingPatt 
{
public static void main(String[] args)
{
	int lines=5;
	int mid=(lines+1)/2;
	int numCount=1;
	int num=1;
	int spaceCount=2;
	for(int i=1;i<=lines;i++)
	{
		for(int k=1;k<=spaceCount;k++)
		{
			System.out.print(" ");
		}
		
		
		for(int j=1;j<=numCount;j++)
		{
			if(j==1 || j==numCount)
			{
			System.out.print(num);
		}
			else
			{
				System.out.print(" ");
			}
			num++;
		}
		
		num=1;
		System.out.println();
		if(i<mid)
		{
			spaceCount--;
			numCount=numCount+2;
		}
		else
		{
			spaceCount++;
			numCount=numCount-2;
		}
	}
}
}
