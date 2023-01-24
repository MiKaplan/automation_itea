package homework.HW9.Task2;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address();

        address1.setIndex("03164");
        address1.setCountry("Ukraine");
        address1.setCity("Kyiv");
        address1.setStreet("Bankova");
        address1.setHouse("1A");
        address1.setApartment("14");

        address1.getAddress();
    }
}
