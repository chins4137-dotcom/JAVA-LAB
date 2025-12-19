import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = s.nextInt();
        System.out.print("Enter breadth: ");
        int b = s.nextInt();
        Shape rec = new Rectangle(l, b);
        rec.printArea();
        System.out.print("Enter base: ");
        int base = s.nextInt();
        System.out.print("Enter Height: ");
        int h = s.nextInt();
        Shape tri = new Triangle(base, h);
        tri.printArea();
        System.out.print("Enter Radius: ");
        float radius = s.nextFloat();
        Shape cir = new Circle(radius);
        cir.printArea();
        s.close();
    }
}