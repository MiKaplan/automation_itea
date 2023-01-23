package homework.HW8;

public class Car {
    String name;
    int length;
    int weight;
    int yearOfIssue;
    int speed;

    public Car(String name, int length, int weight, int yearOfIssue, int speed) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.yearOfIssue = yearOfIssue;
        this.speed = speed;
    }

    public Car(String name) {
        this.name = name;
    }

    public void getCharacters(){
        System.out.println("Name: " + name + ", Length: " + length + "sm, Weight: " + weight + "kg, Max speed: " + speed + "km/h");
    }
}
