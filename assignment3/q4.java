import java.util.*;

public class q4 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        sc.close();
		while(num != 1)
		{
			if(num % 2 == 0)
			{
				num /= 2;
				System.out.println(num);
			}
			else {
				num = (3*num + 1);
				System.out.println(num);
			}			
		}
	}
}