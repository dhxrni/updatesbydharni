public class formatt {
    public static void main(String[] args) {
        try {
            validateStringFormat("12345");
            System.out.println("valid.");
        } catch (InvalidFormatException e) {
            System.out.println(" error: " + e.getMessage());
        }
    }

    public static void validateStringFormat(String input) throws InvalidFormatException {
        if (!input.matches("\\d{3}-\\d{2}-\\d{4}")) {
            throw new InvalidFormatException("  invalid ");
        }
    }
}

class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}
