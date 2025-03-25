import java.util.*;
import Arithmetic.*;
public class operation
{
public static void main(String arg[ ])
{
  int x,y;
  Scanner ob1=new Scanner(System.in);
  System.out.println("\n\n\t\t\tArithmetic Operations");
  System.out.println("\t\t\t------------------------");
  System.out.println("\n Enter the a value");
  x=ob1.nextInt();
  System.out.println("\n Enter the b value");
  y=ob1.nextInt();
  System.out.println("\n\nA : "+x);
  System.out.println("\nB : "+y);
  add  a=new add(x,y);
  subtract s=new subtract(x,y);
  multiply m=new multiply(x,y);
  divide d=new divide(x,y);
}
}