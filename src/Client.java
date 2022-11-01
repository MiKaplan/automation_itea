public class Client {
    String name;
    int age;
    void displayInfo() {
        System.out.println(name + "\t\t\t\t" + age);
    }

    Client(String n, int a){
        name = n;
        age = a;
    }
}
