import java.util.*;
class swapping implements interchange
{
public int a,b,c;
Scanner ob=new Scanner(System.in);
public void input()
{
System.out.println("Enter the A Value : ");
a=ob.nextInt();
System.out.println("Enter the B Value : ");
b=ob.nextInt();
}
public void swap()
{
c=a;
a=b;
b=c;
}
public void output()
{
System.out.println("A : "+a);
System.out.println("B : "+b);
}
public static void main(String s[])
{
swapping ob1=new swapping();
System.out.println("\n\n\t\t\tSWAP TWO NUMBERS");
System.out.println("\t\t\t----------------");
ob1.input();
System.out.println("\t\tBefore Swapping");
System.out.println("\t\t---------------");
ob1.output();
ob1.swap();
System.out.println("\t\tAfter Swapping");
System.out.println("\t\t--------------");
ob1.output();
}
}

