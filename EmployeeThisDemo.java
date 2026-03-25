class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " earns " + salary);
    }
}

public class EmployeeThisDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 50000);
        Employee e2 = new Employee("Riya", 60000);

        e1.display();
        e2.display();
    }
}