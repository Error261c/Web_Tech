import java.util.*;
class Calculator {
    private int n1;
    private int n2;
    public Calculator(int n1, int n2) 
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int addition() 
    {
        int ans = n1+n2;
        System.out.println("Addition: " + ans);
        return ans;
    }
    public int subtraction() 
    {
        int ans = n1-n2;
        System.out.println("Subtraction: " + ans);
        return ans;
    }
    public double division() 
    {
        double ans = (double) n1/n2;
        System.out.println("Division: " +ans);
        return ans;
    }

    public int multiply() 
    {
        int ans = n1*n2;
        System.out.println("Multiplication: " + ans);
        return ans;
    }
}

public class Q3{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        try {
            System.out.print("Enter the first number : ");
            n1 = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the second number : ");
            n2 = Integer.parseInt(sc.nextLine());
            Calculator obj1 = new Calculator(n1, n2);
            Calculator obj2 = new Calculator(n1, n2);
            Calculator obj3 = new Calculator(n1, n2);
            Calculator obj4 = new Calculator(n1, n2);
            obj1.addition();
            obj2.subtraction();
            obj3.multiply();
            obj4.division();
        }
        catch(NumberFormatException e) {
            System.out.println("Integer Input Format only " + e);
        }
        sc.close();
    }
}
