package homework.HW7;

import java.util.ArrayList;

public class Task1 {
    static ArrayList getArrayChet(int firstNum, int secondNum) {
        ArrayList arrayList = new ArrayList();
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }
    static ArrayList getArrayChet(double firstNum, double secondNum) {
        ArrayList arrayList = new ArrayList();
        for (double i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList arrayInt = getArrayChet(1, 5);
        ArrayList arrayDouble = getArrayChet(2.0, 10.0);

        System.out.println(arrayInt);
        System.out.println(arrayDouble);
    }
}
