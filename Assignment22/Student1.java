class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws InvalidAgeException, InvalidNameException {
        if (age < 15 || age > 21) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z\\s]+")) {
            throw new InvalidNameException("Invalid name: " + name);
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Student1 {
    public static void main(String[] args) {
        try {
            int rollNo = Integer.parseInt(args[0]);
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            String course = args[3];
            Student s = new Student(rollNo, name, age, course);
            s.display();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}


//java Student1 1234 John 20 ComputerScience