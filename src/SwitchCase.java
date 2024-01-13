import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        short number;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is to practice Switch case with a simple program!!");
        System.out.println("We will find out the name of the day of the week based on the number.");
        System.out.print("Enter any number ranging from 1 to 7: ");
        number = sc.nextShort();
        switch (number){
            case 1:
                System.out.println("This is first day of the week, i.e., Monday");
                break;
            case 2:
                System.out.println("This is second day of the week, i.e., Tuesday");
                break;
            case 3:
                System.out.println("This is Third day of the week, i.e., Wednesday");
                break;
            case 4:
                System.out.println("This is fourth day of the week, i.e., Thursday");
                break;
            case 5:
                System.out.println("This is fifth day of the week, i.e., Friday");
                break;
            case 6:
                System.out.println("This is sixth day of the week, i.e., Saturday");
                break;
            case 7:
                System.out.println("This is seventh day of the week, i.e., Sunday:)");
                break;
            default:
                System.out.println("Invalid number entered!! Try Again!! ");
                break;
        }
    }
}
