import java.util.*;

public class Q2 {
    public static void addition(int n1, int n2) {
        if(n1< 0|| n2 < 0) 
        {
            throw new ArithmeticException("Negative numbers Exception. Enter positive numbers");
        }
        else 
        {
            System.out.println(n1+n2);
        }
    }
    public static void subtraction(int n1, int n2) {
        if(n1 < 0 || n2< 0) 
        {
            throw new ArithmeticException("Negative numbers Exception. Enter positive numbers");
        }
        else 
        {
            System.out.println(n1-n2);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        sc.close();

        try 
        {
            addition(n1, n2);
        }
        catch(ArithmeticException e) 
        { 
            System.out.println(e);
        }


        try 
        {
            subtraction(n1, n2);
        }
        catch(ArithmeticException e) 
        {
            System.out.println(e);
        }
    }
}
