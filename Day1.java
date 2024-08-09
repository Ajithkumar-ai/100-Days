
import java.util.Scanner;

public class Day1{
    public static void main(String[] args)
    {
        //This id for the Scanner import of the two value 

          Scanner Scan = new Scanner(System.in);
          System.out.println("Enter the value of A ");
            int A= Scan.nextInt();
           System.out.println("Enter the value of B ");
           int B= Scan.nextInt();
           System.out.println(" The multiplication of the two number is: " + A*B);
     
        // Day1 multi = new Day1();
        // multi.multiplication(Scan); 
    }
    // creating function without parameter

    void multiplication(Scanner scan)
    {    
     int a=scan.nextInt();
       int b= scan.nextInt();
        System.out.println(a*b);
    }
}

