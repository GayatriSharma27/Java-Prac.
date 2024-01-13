import java.util.Scanner;
public class IfElse_2 {
        public static void main(String[] args){
            float grossIncome, totalTax, finalIncome;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your yearly income(in Lakhs) and we will calculate tax to be paid this year!");
            System.out.println("Gross Income: ");
            grossIncome = sc.nextFloat();
            if(grossIncome < 2.5f){
                    System.out.println("You are not eligible for filing tax!");
            }
            else if( grossIncome >= 2.5f && grossIncome < 5.0f){
                System.out.println("You will be 5% tax based on your income!");
                totalTax = grossIncome * 0.05f * 100000;
                finalIncome = (grossIncome * 100000) - totalTax;
                System.out.printf("Your tax for this year will be: %.2f and your Final Income will be: %.2f", totalTax, finalIncome);
            }
            else if( grossIncome >= 5.0f && grossIncome <= 10.0f){
                System.out.println("You will be 10% tax based on your income!");
                totalTax = grossIncome * 0.2f * 100000;
                finalIncome = (grossIncome * 100000) - totalTax;
                System.out.printf("Your tax for this year will be: %.2f and your Final Income will be: %.2f", totalTax, finalIncome);
            }
            else{
                System.out.println("You will be 30% tax based on your income!");
                totalTax = grossIncome * 0.03f * 100000;
                finalIncome = (grossIncome * 100000) - totalTax;
                System.out.printf("Your tax for this year will be: %.2f and your Final Income will be: %.2f", totalTax, finalIncome);
            }

        }
}

