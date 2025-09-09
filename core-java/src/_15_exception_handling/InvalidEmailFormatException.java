package _15_exception_handling;

public class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException() {
        super("Invalid email format");
    }

    public InvalidEmailFormatException(String message) {
        super(message);
    }
}