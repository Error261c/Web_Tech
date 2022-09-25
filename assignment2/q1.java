import java.util.*;  
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);  
        System.out.println("Enter the double: ");  
        double a = input.nextDouble();  
        
        if(a>80&&a<90)
        {
            a = a+5.0;
        }
        System.out.println(a);
	}
}
