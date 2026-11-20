import java.util.Scanner;

class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");

        int year = sc.nextInt();
        for 
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println(year + " This is a leap year!");
        }
        else{ 
            System.out.println(year + " This is not a leap year!");
        }     
    }
}