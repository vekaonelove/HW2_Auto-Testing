public class Triangle {
    private int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isTriangle() {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    public String getTriangleType() {
        if (isEquilateral()) {
            return "Equilateral";
        } else if (isIsosceles()) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    private boolean isEquilateral() {
        return a == b && b == c;
    }

    private boolean isIsosceles() {
        return a == b || b == c || a == c;
    }

    private boolean isScalene() {
        return a != b && b != c && a != c;
    }
}
