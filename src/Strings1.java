import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! Please enter a string and we will change its case! ");
        System.out.print("Input data: ");
        String input = sc.nextLine();
        System.out.println("Your string is converted to lowercase!!");
        System.out.println(input.toLowerCase());

    }
}
