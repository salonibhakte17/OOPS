class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Saloni", 20);
        Person p2 = new Person("Sam", 22);

        p1.display();
        p2.display();
    }
}
