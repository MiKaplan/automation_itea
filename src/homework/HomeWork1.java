package homework;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Task 1
        System.out.println("\n Task 1 \n");
        System.out.println("Enter name:");
        String name = in.next();
        System.out.println("Enter surname:");
        String surname = in.next();

        String fullName = name + " " + surname;
        System.out.println(fullName);

        //Task2
        System.out.println("\n Task 2 \n");

        System.out.println("Enter first fractional number");
        double firstNum = in.nextDouble();
        System.out.println("Enter second fractional number");
        double secondNum = in.nextDouble();

        double sum = firstNum + secondNum;
        System.out.println(sum);

        //Task 3
        System.out.println("\n Task 3 \n");

        int num = in.nextInt();

        int numOfHundreds = num / 100;

        int numOfTens = num / 10;

        System.out.println("Number of hundreds: " + numOfHundreds + ", Number of tens: " + numOfTens + ", Number of units" + num);



    }
}
