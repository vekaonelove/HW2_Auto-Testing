import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, false, ''",       // 1. Все стороны равны 0: Не треугольник
            "0, 5, 7, false, ''",       // 2. Одна сторона равна 0: Не треугольник
            "1, 1, 3, false, ''",       // 3. Сумма двух сторон равна третьей: Не треугольник
            "2, 5, 7, false, ''",       // 4. Сумма двух сторон равна третьей: Не треугольник
            "5, 5, 10, false, ''",      // 5. Сумма двух сторон равна третьей: Не треугольник
            "1, 2, 8, false, ''",       // 6. Сумма двух сторон меньше третьей: Не треугольник
            "2, 4, 9, false, ''",       // 7. Сумма двух сторон меньше третьей: Не треугольник
            "0, 0, 5, false, ''",       // 8. Две стороны равны 0: Не треугольник
            "3, 4, 5, true, Scalene",   // 9. Все стороны разные: Разносторонний треугольник
            "6, 8, 10, true, Scalene",  // 10. Все стороны разные: Разносторонний треугольник
            "7, 10, 12, true, Scalene", // 11. Все стороны разные: Разносторонний треугольник
            "9, 13, 15, true, Scalene", // 12. Все стороны разные: Разносторонний треугольник
            "5, 5, 8, true, Isosceles", // 13. Ровно две стороны равны: Равнобедренный треугольник
            "7, 7, 10, true, Isosceles",// 14. Ровно две стороны равны: Равнобедренный треугольник
            "10, 10, 12, true, Isosceles",// 15. Ровно две стороны равны: Равнобедренный треугольник
            "6, 10, 10, true, Isosceles",// 16. Ровно две стороны равны: Равнобедренный треугольник
            "3, 3, 3, true, Equilateral",// 17. Все стороны равны: Равносторонний треугольник
            "5, 5, 5, true, Equilateral",// 18. Все стороны равны: Равносторонний треугольник
            "10, 10, 10, true, Equilateral",// 19. Все стороны равны: Равносторонний треугольник
            "8, 8, 8, true, Equilateral" // 20. Все стороны равны: Равносторонний треугольник
    })
    void testTriangleProperties(int a, int b, int c, boolean isTriangleExpected, String expectedType) {
        Triangle triangle = new Triangle(a, b, c);
        assertEquals(isTriangleExpected, triangle.isTriangle(),
                String.format("Failed for sides: %d, %d, %d", a, b, c));

        if (isTriangleExpected) {
            assertEquals(expectedType, triangle.getTriangleType(),
                    String.format("Type mismatch for sides: %d, %d, %d", a, b, c));
        }
    }
}
