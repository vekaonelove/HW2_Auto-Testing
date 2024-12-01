import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three non-negative integers (sides of the triangle):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Triangle triangle = new Triangle(a, b, c);

        if (triangle.isTriangle()) {
            System.out.println("Triangle type: " + triangle.getTriangleType());
        } else {
            System.out.println("These numbers do not form a triangle.");
        }
        scanner.close();
    }
}
