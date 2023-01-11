package homework;

public class test {
    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        int count = 0;
        if (A < B) {
            for (int i = A; i <= B ; i++) {
                System.out.println(i);
                count++;
            }
            System.out.println("\n Counter: " + count);
        } else if (A > B){
            for (int i = A; i >= B ; i--) {
                System.out.println(i);
                count++;
            }
            System.out.println("\n Counter: " + count);
        } else {
            System.out.println(A + "=" + B);
        }

    }
}
