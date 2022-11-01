public class Person {
        String name;
        int age;
        void displayInfo() {
            System.out.println(name + "\t" + age);
        }

        int yob;
        int age(){
            return 2022 - yob;
        }
        int ageTwoYearsAgo(){
            return 2020 - yob;
        }

        Person(String n, int a) {
            this.name = n;
            this.age = a;
        }

        Person(int y) {
            this.yob = y;
        }
}
