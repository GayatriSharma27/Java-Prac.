import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! This program will conver KMs to Miles for you just enter the distance in KMs below!!");
        System.out.print("KM: ");
        float km = sc.nextFloat();
        float miles = km * 0.621f;
        System.out.println("The distance you entered in Km is " +miles+ " in miles.");
        System.out.println("Run this program again, if you have more data to convert. Thanks!");
    }
}
