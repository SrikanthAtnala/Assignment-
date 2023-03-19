import java.util.Scanner;
class Armstrongornot 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int backup=num;
		int power=0;
		int product=1;
		int sum=0;
		int lastdigit=0;
		while (num!=0)
		{
			power++;
			num=num/10;
		}
		num=backup;
		while (num!=0)
		{
			lastdigit=num%10;
			for ( int a=1;a<=power ;a++ )
			{
				product=product*lastdigit;
			}
			sum=sum+product;
			product=1;
			num=num/10;
		}
		if (sum==backup)
		{
		System.out.println("given number is armstrong");	
		}
		else
		{
			System.out.println("given number is not armstrong");
		}
	}
}
