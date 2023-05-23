class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        // Default constructor
    }

    public MyDate(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
        // Check if day is valid
        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        // Check if month is valid
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month);
        }

        // Check if year is valid
        if (year < 0) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }
}

public class TestDate {
    public static void main(String[] args) {
        try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            MyDate date = new MyDate(day, month, year);
            date.display();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        } catch (InvalidDayException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


//java TestDate 10 05 2023