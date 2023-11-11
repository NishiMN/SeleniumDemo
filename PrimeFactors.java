import java.util.Scanner;
class PrimeFactors
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Please enter the number : ");
     int a = sc.nextInt();
	 System.out.print("Prime Factor(s) of "+a+" is/are : ");
     
     fact(a);
	 
   }
   public static void fact(int a)
   {0p['
      for(int i=1;i<=a;i++)
      {
         if(a%i==0)
	 {
	    prime(i);
	 }
      }
   }
   public static void prime(int a)
   {
      int i=2;
      for(;i<a;i++)
      {
          if(a%i==0)
	  {
	     break;
	  }
      }

      if(i==a)
      {
         System.out.print(a+" ");
      }
   }
}