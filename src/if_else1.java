import java.util.Scanner;
public class if_else1 {
    public static void main(String[] args){
        float m1,m2,m3,total,percentage;
            System.out.println("To calculate if a student is pass or fail!");
            System.out.println("Hi! We will calculate your result. Please enter your marks in following subjects:");
            Scanner sc = new Scanner(System.in);
            System.out.print("Physics: ");
            m1 = sc.nextFloat();
            System.out.print("Chemistry: ");
            m2 = sc.nextFloat();
            System.out.print("Biology: ");
            m3 = sc.nextFloat();


            total = m1 + m2 + m3;
            System.out.printf("Total grades: %.2f", total);

            percentage = total/3.0f;

            System.out.printf("\nPercentage: %.2f", percentage);

            if(percentage >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
                System.out.println("\nCongrats you passed the course!!");
            }
            else {
                System.out.println("\nSorry! You will have to repeat the courses!");
            }

        }
}
