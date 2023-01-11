package homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        int num = 10;

        System.out.println("Task 1");
        for (int i = 1; i <= num ; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nTask 2");
        for (int i = 1; i <= num ; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("\nTask 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int userNum = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= userNum; i++) {
            count += i;
        }
        System.out.println(count);


    }
}
