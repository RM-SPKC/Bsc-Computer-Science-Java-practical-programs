import java.util.*;
class area
{
area(int a)
{
System.out.println("\nArea of Square : "+(a*a));
}
area(int l,int b)
{
System.out.println("\nArea of Rectangle : "+(l*b));
}
area(int bs,double h)
{
System.out.println("\nArea of Triangle : "+(0.5f*bs*h));
}
public static void main(String args[])
{
int a,l,b,bs;
double h;
Scanner obj=new Scanner(System.in);
System.out.println("\n\n\t\t\tConstructor overloading");
System.out.println("\t\t\t-----------------------");
System.out.println("\n\tArea of Square:");
System.out.println("\t----------------");
System.out.println("Enter the side:");
a=obj.nextInt();
area a1=new area(a);
System.out.println("\n\tArea of Rectangle:");
System.out.println("\t------------------");
System.out.println("Enter the length:");
l=obj.nextInt();
System.out.println("Enter the breadth:");
b=obj.nextInt();
area a2=new area(l,b);
System.out.println("\n\tArea of Triangle:");
System.out.println("\t------------------");
System.out.println("Enter the base:");
bs=obj.nextInt();
System.out.println("Enter the height:");
h=obj.nextDouble();
area a3=new area(bs,h);
}
}







