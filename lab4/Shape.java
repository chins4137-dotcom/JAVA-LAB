public abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void printArea() {
        int r = l * b;
        System.out.println("Area of rectangle: " + r);
    }
}

class Triangle extends Shape {
    int h;
    int b;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    void printArea() {
        System.out.println("Area of traingle: " + (0.5 * b * h));
    }
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
