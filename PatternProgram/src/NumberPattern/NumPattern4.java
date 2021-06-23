package NumberPattern;

public class NumPattern4 
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
				if(i==1 || i==lines || j==1 || j==numCount)

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
		}
	}
}
