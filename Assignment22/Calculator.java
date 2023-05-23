class FewArgumentsException extends Exception {
    public FewArgumentsException(String message) {
        super(message);
    }
}

class InvalidOperatorException extends Exception {
    public InvalidOperatorException(String message) {
        super(message);
    }
}

class NegativeResultException extends Exception {
    public NegativeResultException(String message) {
        super(message);
    }
}

public class Calculator {
    public static void main(String[] args) {
        try {
            if(args.length < 3) {
                throw new FewArgumentsException("At least 3 arguments are required: 2 operands and 1 operator.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            char operator = args[2].charAt(0);

            int result = 0;

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new InvalidOperatorException("Invalid operator: " + operator);
            }

            if(result < 0) {
                throw new NegativeResultException("Result is negative: " + result);
            }

            System.out.println("Result: " + result);

        } catch(FewArgumentsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(InvalidOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(NegativeResultException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(NumberFormatException e) {
            System.out.println("Error: Invalid operand format. Please enter integers only.");
        } catch(ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


/*java Calculator 5 4 +
Result: 9

java Calculator 5 4 -
Result: 1*/