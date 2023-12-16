import java.util.Scanner;
public class CalculateMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! I will help you calculate your percentage for this semester:");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your marks in first subject: ");
        float mark1 = sc.nextFloat();
        System.out.println("Enter your marks in second subject: ");
        float mark2 = sc.nextFloat();
        System.out.println("Enter your marks in third subject: ");
        float mark3 = sc.nextFloat();
        System.out.println("Enter your marks in fourth subject: ");
        float mark4 = sc.nextFloat();
        System.out.println("Enter your marks in fifth subject: ");
        float mark5 = sc.nextFloat();

        float sum = mark1 + mark2 + mark3 + mark4 + mark5;
        float percent = (sum/500) * 100;
        System.out.println("Your percentage for this semester is: " + percent);
    }
}
