import java.util.*;
public class TwoD
{
    public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t\tAddition of Matrices");
		System.out.println("\t\t\t----------------------");
        System.out.print("\nEnter number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter number of columns: ");
        int c = s.nextInt();
        
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int res[][] = new int[r][c];

        System.out.println("\nEnter the elements for Matrix A:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
                a[i][j] = s.nextInt();
        }

        System.out.println("\nEnter the elements for Matrix B:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
                b[i][j] = s.nextInt();
        }

        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
			{
                res[i][j] += a[i][j]+ b[i][j];
            }
        }

        System.out.println("\nMatrix A:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
              {  System.out.print(a[i][j]+"\t");}
			System.out.println();
        }
        
		System.out.println("\nMatrix B:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
              {  System.out.print(b[i][j]+"\t");}
			System.out.println();
        }
		
		System.out.println("\nAddition of two Matrices:");
        for (int i = 0; i < r; i++) 
		{
            for (int j = 0; j < c; j++) 
              {  System.out.print(res[i][j]+"\t");}
			System.out.println();
        }
        
    }
}
