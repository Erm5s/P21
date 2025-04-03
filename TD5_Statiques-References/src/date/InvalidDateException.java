package date;

public class InvalidDateException extends RuntimeException {
    public InvalidDateException(String errorMessage) {
        super(errorMessage);
    }
}
