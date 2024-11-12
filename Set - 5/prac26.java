import java.io.IOException;
import java.sql.SQLException;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class prac26 {

    public static void methodThrowingCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is a custom checked exception");
    }

    public static void methodThrowingUncheckedException() {
        throw new CustomUncheckedException("This is a custom unchecked exception");
    }

    public static void methodThrowingStandardCheckedExceptions() throws IOException, SQLException {
        throw new IOException("This is an IOException");
    }

    public static void methodThrowingStandardUncheckedExceptions() {
        throw new NullPointerException("This is a NullPointerException");
    }

    public static void main(String[] args) {
        try {
            methodThrowingCheckedException();
        } catch (CustomCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            methodThrowingStandardCheckedExceptions();
        } catch (IOException | SQLException e) {
            System.out.println("Caught standard checked exception: " + e.getMessage());
        }

        try {
            methodThrowingUncheckedException();
        } catch (CustomUncheckedException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        try {
            methodThrowingStandardUncheckedExceptions();
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Caught standard unchecked exception: " + e.getMessage());
        }
        System.out.print("\nName : Jay Makadia \nID : 23DCS055 ");
    }
}