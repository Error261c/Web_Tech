import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double interest = 0.05;
		int population = 80000;
		int year = 0;
		while(population<=150000)
		{
		    population = (int) (population*(1+interest));
		    year++;
		}
		System.out.println(year);
	}
}
