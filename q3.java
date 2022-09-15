import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the value of num1 and num2");  
        Scanner sc = new Scanner(System.in);  
        int num1 = sc.nextInt();  
        int num2 = sc.nextInt();  
        int q = 0, r = 0;  
      
        q= num1 / num2;  
  
        r = num1 % num2;  
  
        System.out.println("Quotient : "+ q);  
        System.out.println("Remainder : " + r);  


	}
}


