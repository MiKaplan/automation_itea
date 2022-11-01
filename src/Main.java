public class Main {
    public static void main(String[] args) {
        Person serega = new Person("Serhii Bogdanovich Bondaruk", 45);
        Client bodia = new Client("Nazaruk Bohdan", 20);
        Client sofia = new Client("Sofia Kolomiets", 25);
        Person yearOfBirth = new Person(1997);

        System.out.println("HW2, 7 point");
        displayHeader();
        serega.displayInfo();
        displaySeparator();

        System.out.println("HW2, 18 point");
        displayHeader();
        bodia.displayInfo();
        sofia.displayInfo();
        displaySeparator();

        System.out.println("HW2, 28 point");
        System.out.println("Якщо людина народилась в " + yearOfBirth.yob +"році, то його вік - " +yearOfBirth.age());
        displaySeparator();

        System.out.println("HW2, 29 point");
        System.out.println("Якщо людина народилась в " + yearOfBirth.yob +"році, то його вік 2 роки назад - " +yearOfBirth.ageTwoYearsAgo());
        displaySeparator();


    }

    private static void displayHeader() {
        System.out.println("Name\t\t\t\t\t\t age \n");
    }
    private static void displaySeparator() {
        System.out.println("________________________________");
    }
}