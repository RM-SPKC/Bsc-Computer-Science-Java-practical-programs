import java.util.*;
class Moverload{

    void add(int a, int b)
	{
      System.out.println("\n\tSum of two integer values: " +(a + b));
    }

    void add(double a, double b) 
	{
       System.out.println("\n\tSum of two double values: " +(a + b));
    }

    void add(String a,String b) 
	{
        System.out.println("\n\tConcatenation of two Strings: " +(a + b));
    }

    public static void main(String[] args)
	{
        Moverload m = new Moverload();
        System.out.println("\n\n\t\tMethod Overloading");
        System.out.println("\t\t-------------------");
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("\nSum of two double values:");
		System.out.println("-------------------------");
        System.out.println("Enter the first value :");
        double x=s.nextDouble();
		System.out.println("Enter the second value :");
        double y=s.nextDouble();
        m.add(x,y);

        System.out.println("\nSum of two integer values:");
		System.out.println("-------------------------");
        System.out.println("Enter the first value :");
        int i=s.nextInt();
		System.out.println("Enter the second value :");
        int j=s.nextInt();
        m.add(i,j);
		
		System.out.println("\nConcatenation of two strings:");
		System.out.println("----------------------------");
        System.out.println("Enter the first string :");
        String a=s.next();
		System.out.println("Enter the second string :");
        String b=s.next();
        m.add(a,b);        
    }
}
