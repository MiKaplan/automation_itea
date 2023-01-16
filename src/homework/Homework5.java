package homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Task 1 (in code)");

        byte[] byteArray = {1, 2, -3};
        short[] shortArray = {4, 5, -100};
        int[] intArray = {11, 300, -43};
        long[] longArray = new long[3];
        longArray[0] = 23423;
        longArray[1] = 12312;
        longArray[2] = 3425678;
        boolean[] booleanArray = {true, false};
        float[] floatArray = {1.3f, 56.88f};
        double[] doubleArray = {5.5, 2.1};

        System.out.println("\nTask2");
        int[] firstArray = {2, -2, 3, 5};
        int[] secondArray = {1, 3, -8, 10, 50};
        int[] resultArray = new int[secondArray.length];

        for (int i = 0; i < secondArray.length; i++) {
            if (i < secondArray.length - 1) {
                resultArray[i] = firstArray[i] + secondArray[i];
            } else {
                resultArray[i] = secondArray[i];
            }

            System.out.println(resultArray[i]);
        }

        System.out.println("\nTask3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for arithmetic progression:");
        double numberForArithmeticProgression = scanner.nextDouble();
        System.out.println("Enter number for geometric progression (>1):");
        double numberForGeometricProgression = scanner.nextDouble();
        if (numberForGeometricProgression <= 1) {
            System.out.println("Oops, wrong Geometric progression number");
        } else {
            getArithmeticProgressions(numberForArithmeticProgression);
            getGeometricProgression(numberForGeometricProgression);
        }
    }

    public static void getArithmeticProgressions(double numberForArithmeticProgression) {
        int progressionLength = 12;
        System.out.println("Арифметическая прогрессия с циклом for" + " c d = " + numberForArithmeticProgression);
        for (double i = 1; i <= progressionLength; i+= numberForArithmeticProgression) {
            System.out.println(i);
        }

        System.out.println("Арифметическая прогрессия с циклом while" + " c d = " + numberForArithmeticProgression);
        double count = 1;
        while (count <= progressionLength) {
            System.out.println(count);
            count += numberForArithmeticProgression;
        }

        System.out.println("Арифметическая прогрессия с циклом do/while" + " c d = " + numberForArithmeticProgression);
        count = 1;
        do {
            System.out.println(count);
            count += numberForArithmeticProgression;
        }
        while (count <= progressionLength);

    }
    public static void getGeometricProgression(double numberForGeometricProgression) {
        int progressionLength = 12;
        System.out.println("Геометрическая прогрессия с циклом for" + " c q = " + numberForGeometricProgression);
        for (double i = 1; i <= progressionLength; i*= numberForGeometricProgression) {
            System.out.println(i);
        }

        System.out.println("Геометрическая прогрессия с циклом while" + " c q = " + numberForGeometricProgression);
        double count = 1;
        while (count <= progressionLength) {
            System.out.println(count);
            count *= numberForGeometricProgression;
        }

        System.out.println("Геометрическая прогрессия с циклом do/while" + " c q = " + numberForGeometricProgression);
        count = 1;
        do {
            System.out.println(count);
            count *= numberForGeometricProgression;
        }
        while (count <= progressionLength);
    }
}
