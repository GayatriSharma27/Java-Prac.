import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        System.out.println("This Program takes your name and then greets you!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = sc.nextLine();
        System.out.println("Hi! " + name + "! How are you? We are happy to see you!!");
    }

}
