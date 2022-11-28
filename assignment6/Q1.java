import java.util.*;
public class Q1 {
    
    public static void divide(int n1, int n2){
        if(n1==0||n2==0)
        {
            throw new ArithmeticException("Zero Exception");
        }
        else 
        {
            System.out.println(n1/n2);
        }
    }

    public static void multiply(int n1, int n2){
        if(n1==0||n2==0)
        {
            throw new ArithmeticException("Zero exception");
        }
        else 
        {
            System.out.println(n1*n2);
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        sc.close();

        try
        {
            multiply(a,b);
        }
        catch(ArithmeticException e) 
        {
            System.out.println(e);
        }


        try 
        {
            divide(a,b);
        }
        catch(ArithmeticException e) 
        {
            System.out.println(e);
        }
        
        
    }
}
