import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("n n^2 n^3 n^4");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+" "+i*i+" "+i*i*i+" "+i*i*i*i);
        }
	}
}
