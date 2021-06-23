package charpattern;

public class CharPattern7 
{
public static void main(String[] args) 
{
int lines=5;
int charCount=1;
char ch='A';
int mid=(lines+1)/2;
for(int i=1;i<=lines;i++)
{
	for(int j=1;j<=charCount;j++)
	{
		System.out.print(ch++);
	}
	ch='A';
	System.out.println();
	if(i<mid)
	{
		charCount++;
		
	}
	else
	{
		charCount--;
	}
}
}
}
