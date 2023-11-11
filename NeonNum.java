import java.util.Scanner;
class NeonNum
{
	public static void main(String[] args)
	{
   Scanner sc = new Scanner(System.in);
   System.out.println("Please enter the Number");
   int a = sc.nextInt();

   
   int sqr = a*a;
   int sum = 0;
   
   while(sqr!=0)
   {
      sum+=sqr%10;
      sqr/=10;
   }

   if(sum==a)
   {
      System.out.println("It's a Neon Number");
   }
    else
   {
      System.out.println("It's not a Neon Number");
   }
	}
}