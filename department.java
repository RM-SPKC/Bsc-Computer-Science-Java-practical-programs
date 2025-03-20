import java.util.*;
class student
{ 
int   rollno,age;
String name;
student(int i,String j)
{
rollno=i;
name=j;
}
void output()
{
System.out.println("\nRollno : "+rollno);
System.out.println("\nName   : "+name);
}
}
class department extends student
{
String dname;
department(int a,String b,String c)
{
super(a,b);
dname=c;
}
void output()
{
super.output();
System.out.println("\nDepartment : "+dname);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("\t\t\tMethod Overidding");
System.out.println("\t\t\t-----------------");
System.out.println("Enter the rollno:");
int rollno=s.nextInt();
System.out.println("Enter the name:");
String name=s.next();
System.out.println("Enter the department name : ");
String dname=s.next();

department ob=new department(rollno,name,dname);
System.out.println("\n\n\t\t\tStudent Details");
System.out.println("\t\t\t---------------");
ob.output();
}
}