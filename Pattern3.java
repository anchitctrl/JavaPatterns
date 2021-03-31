
//A
//B B
//C C C
//D D D D
//E E E E E

public class Pattern3 
{

	public static void main(String[] args) 
	{
		int n=5;
		char S='A';
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(S + " ");
				
			}
			S++;
			System.out.println();
		}
	}

}
