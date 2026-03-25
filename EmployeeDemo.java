abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return 0.20 * salary;
    }
}

class Developer extends Employee {
    double salary, incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return 0.10 * salary + incentive;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e;

        e = new Manager("Amit", 1, 50000);
        System.out.println("Manager Bonus: " + e.calculateBonus());

        e = new Developer("Riya", 2, 40000, 5000);
        System.out.println("Developer Bonus: " + e.calculateBonus());
    }
}