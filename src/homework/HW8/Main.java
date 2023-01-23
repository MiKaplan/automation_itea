package homework.HW8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 305, 3, 1997, 160);
        Car car2 = new Car("BMW", car1.length, 4, 2010, 200);
        Car car3 = new Car("Bugatti");
        Car car4 = new Car(car1.name, 250, car2.weight, 2005, car2.speed);
        Car car5 = new Car("Mers");

        car1.getCharacters();
        car2.getCharacters();
        car3.getCharacters();
        car4.getCharacters();
        car5.getCharacters();
    }
}
