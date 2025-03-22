import java.util.*;
class OneD 
{
 public static void main(String args[])
 {
  int i;
  Scanner s =new Scanner(System.in);
  System.out.println("\n\n\t\t\tOne Dimensional Array");
  System.out.println("\t\t\t---------------------");
  System.out.println("\nEnter the no. of elements : ");
  int n=s.nextInt();
  
  int a[]=new int[n];
    System.out.println("\n\nEnter the elements one by one : ");
  for(i=0;i<n;i++)
      a[i]=s.nextInt();
	  
  System.out.println("\n\nArray elements are: ");
  for(i=0;i<n;i++)
      System.out.println(a[i]);
  
  System.out.println("\n\nReversed Array: ");
  for(i=n-1;i>=0;i--)
      System.out.println(a[i]);
  } 
 }
