package NumberPattern;

public class numPattern11 
{
public static void main(String[] args)
{
	int lines=5;
	int numCount=1;
	int num=1;
	int mid=(lines+1)/2;
for(int i=1;i<=lines;i++)
{
	for(int j=1;j<=numCount;j++)
	{
		System.out.print(num);
	}
	if(i<mid)
	{
		numCount++;
	}
	else
	{
		numCount--;
	}
	System.out.println();
}
}
}
