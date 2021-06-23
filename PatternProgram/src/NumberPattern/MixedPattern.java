package NumberPattern;

public class MixedPattern 
{
public static void main(String[] args)
{
	int line=4;
	int numcount=3;
	int strcount=0;
	int num=1;
	String str="*";
	for(int i=1;i<=line;i++)
	{
		
		for(int k=1;k<=strcount;k++)
		{
			System.out.print(str+" ");
		}
		for(int j=1;j<=numcount;j++)
		{
			System.out.print(num+" ");
			num++;
		}
		num=1;
		System.out.println();
		numcount--;
		strcount++;
	}
}
}
