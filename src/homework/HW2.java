package homework;

public class HW2 {
    public static void main(String[] args) {
        int number = 3;

        String[] nameArray = new String [] {"x", "y", "z"};
        int[] intArray = new int[3];

        for (int i = 0; i < number; i++) {
            int numberOfPoint = i + 1;
            intArray[i] = i * 10;

            System.out.println("Task" + -number + ", " + "Point " + numberOfPoint);
            System.out.println(nameArray[i] + " = " + intArray[i]);

        }
    }
}
