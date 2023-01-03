package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
       getResult();
    }
    public static void getResult(){
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        System.out.println("Enter first number:");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter one arithmetic operation (+, -, *, /, pow, %");
        String operation = scanner.next();
        System.out.println("Enter second number:");
        double secondNum = scanner.nextDouble();

        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = firstNum - secondNum;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = firstNum * secondNum;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = firstNum / secondNum;
                System.out.println("Result: " + result);
                break;
            case "pow":
                result = Math.pow(firstNum, secondNum);
                System.out.println("Result: " + result);
                break;
            case "%":
                result = firstNum % secondNum;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("You enter wrong arithmetic operation");
                getResult();
                break;
        }

    }
}
