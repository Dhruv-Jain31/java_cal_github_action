public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test addition
        assert calculator.add(2, 3) == 5 : "Addition test failed";
        System.out.println("Addition test passed");

        // Test subtraction
        assert calculator.subtract(10, 4) == 6 : "Subtraction test failed";
        System.out.println("Subtraction test passed");

        // Test multiplication
        assert calculator.multiply(3, 3) == 9 : "Multiplication test failed";
        System.out.println("Multiplication test passed");

        // Test division
        try {
            assert calculator.divide(6, 2) == 3 : "Division test failed";
            System.out.println("Division test passed");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
