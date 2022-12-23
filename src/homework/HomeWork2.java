package homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\n Task 1 \n");

        System.out.println("Enter first number:");
        double firstNum = in.nextDouble();
        System.out.println("Enter second number");
        double secondNum = in.nextDouble();

        double maxNum = Math.max(firstNum, secondNum);
        double minNum = Math.min(firstNum, secondNum);

        System.out.println("Max number: " + maxNum + ", Min number: " + minNum);

        System.out.println("\n Task 2 \n");

        System.out.println("Enter first number:");
        firstNum = in.nextDouble();
        System.out.println("Enter second number:");
        secondNum = in.nextDouble();
        System.out.println("Enter third number:");
        double thirdNum = in.nextDouble();

        maxNum = Math.max(Math.max(firstNum, secondNum), thirdNum);
        minNum = Math.min(Math.min(firstNum, secondNum), thirdNum);

        double avgNum;

        if ((maxNum == firstNum && minNum == secondNum) || (maxNum == secondNum && minNum == firstNum)) {
            avgNum = thirdNum;
        } else if ((maxNum == firstNum && minNum == thirdNum) || (maxNum == thirdNum && minNum == firstNum)) {
            avgNum = secondNum;
        } else {
            avgNum = firstNum;
        }
        System.out.println("Max number: " + maxNum + ", Min number: " + minNum + ", Average number: " + avgNum);

        System.out.println("\n Task 3 \n");

        getTimesOfDay();


    }
    public static void getTimesOfDay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (1-24):");

        int intNum = sc.nextInt();

        if ( 1 <= intNum && intNum <= 12) {
            System.out.println("доброго ранку");
        } else if (12 <= intNum && intNum <= 20) {
            System.out.println("доброго дня");
        } else if (20 <= intNum && intNum <= 24) {
            System.out.println("доброї ночі");
        } else {
            System.out.println("Oh no... You need enter number (1-24)");
            getTimesOfDay();
        }
    }
}
