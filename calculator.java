interface calculator {
    double add(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}

class BasicCalculator implements calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;
        else
            throw new IllegalArgumentException("Cannot divide by zero");
    }
}

public class calculator {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        
        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
            System.out.println("Division by zero: " + calculator.divide(num1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
