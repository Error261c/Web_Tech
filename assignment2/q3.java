import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month_num = input.nextInt();

        System.out.print("Input the year: ");
        int year = input.nextInt();
        
        String month_name = "";
        int month_days = 0;

        switch (month_num) {
            case 1:
                month_name = "January";
                month_days = 31;
                break;
            case 2:
                month_name = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    month_days = 29;
                } else {
                    month_days = 28;
                }
                break;
            case 3:
                month_name = "March";
                month_days = 31;
                break;
            case 4:
                month_name = "April";
                month_days = 30;
                break;
            case 5:
                month_name = "May";
                month_days = 31;
                break;
            case 6:
                month_name = "June";
                month_days = 30;
                break;
            case 7:
                month_name = "July";
                month_days = 31;
                break;
            case 8:
                month_name = "August";
                month_days = 31;
                break;
            case 9:
                month_name = "September";
                month_days = 30;
                break;
            case 10:
                month_name = "October";
                month_days = 31;
                break;
            case 11:
                month_name = "November";
                month_days = 30;
                break;
            case 12:
                month_name = "December";
                month_days = 31;
        }
        System.out.print(month_name + " " + month_days);
	}
}
