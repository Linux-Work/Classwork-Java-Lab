import java.util.Scanner;
// VowelException.java
class VowelException extends Exception {
    public VowelException(String message) {
        super(message);
    }
}

// BlankException.java
class BlankException extends Exception {
    public BlankException(String message) {
        super(message);
    }
}

// ExitException.java
class ExitException extends Exception {
    public ExitException(String message) {
        super(message);
    }
}

public class TestException {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char ch;

            System.out.print("Enter a character: ");
            ch = input.next().charAt(0);

            try {
                if (ch == 'X') {
                    throw new ExitException("Program terminated by user");
                } else if (ch == ' ') {
                    throw new BlankException("Blank space not allowed");
                } else if ("AEIOUaeiou".indexOf(ch) != -1) {
                    throw new VowelException("Vowel not allowed");
                } else {
                    System.out.println("Valid character");
                }
            } catch (VowelException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (BlankException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ExitException e) {
                System.out.println("Error: " + e.getMessage());
                System.exit(0);
            }
        }
    }
}
