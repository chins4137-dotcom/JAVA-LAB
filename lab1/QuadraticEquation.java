import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter co-efficient of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter co-effiecient of b: ");
        b = scanner.nextDouble();
        System.out.print("Enter constant : ");
        c = scanner.nextDouble();
        d = (b * b) - 4 * (a * c);
        if (d < 0) {
            System.out.println("Rootes are imaginary");
        } else if (d > 0) {
            System.out.println("Roots are Real and Distinct");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("Roots are Real and Equal");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x1);
        }
    }
}