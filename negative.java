import java.util.*;
class negative
{
 public static void main(String args[])
 {
   int i,n;
   Scanner ob=new Scanner(System.in);
   System.out.println("\n\n\t\tNEGATIVE ARRAY SIZE EXCEPTION");
   System.out.println("\t\t-----------------------------");
   try
   {
     System.out.println("\nEnter the Array Size:");
     n=ob.nextInt();
     int a[]=new int[n];
   }
   catch(NegativeArraySizeException e)
   {
    System.out.println(e);
    System.out.println("\nEnter the Positive Array:");
    n=ob.nextInt();
   }
   System.out.println("\n\t\t ARRAY INDEX OUT OF BOUNDS EXCEPTION");
   System.out.println("\t\t------------------------------------");
   int a[]=new int[n];
   try
   {
    System.out.println("\nEnter the Array Values:");
    for(i=1;i<=n;i++)
    {
     a[i]=ob.nextInt();
    }
   }
   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println(e);
    System.out.println("\nArray Size is full");
   }
 }
}
