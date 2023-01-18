package homework.HW7;

public class Task2 {
    static void convector (int num) {
        int temp;

        temp = num % 8;

        if (num >= 8) {
            convector(num / 8);
        }
        System.out.print(temp);
    }
    public static void main(String[] args) {
        int number = 180;

        convector(number);
    }
}
