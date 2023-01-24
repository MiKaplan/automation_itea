package homework.HW9.Task1;

public class Main {
    public static void main(String[] args) {
        Computers[] computers = new Computers[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computers("Computer #" + (i+1), i * 50 + 700 + "$");
            System.out.println(computers[i].count + ", price: " + computers[i].price);
        }
    }
}
