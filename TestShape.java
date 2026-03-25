abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    float r = 3;

    void calculate_area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rect extends Shape {
    int l = 4, b = 5;

    void calculate_area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

class TestShape {
    public static void main(String[] args) {


        Circle c = new Circle();
        c.display_info();
        c.calculate_area();

        Rect r = new Rect();
        r.display_info();
        r.calculate_area();
    }
}