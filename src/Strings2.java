import java.util.Scanner;
public class Strings2 {
    public static void main(String[] args){
        System.out.println("Welcome! Enter any data we will modify it by adding underscores!!");
        System.out.println("Input Data: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Updated data: ");
        System.out.println(input.replace(' ', '_'));
    }
}
