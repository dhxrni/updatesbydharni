public class custom {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeNotValidException e) {
            System.out.println("Caught custom error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
