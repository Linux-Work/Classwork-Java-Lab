import java.io.*;
import java.util.*;

public class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws IOException {
	Scanner s = new Scanner(System.in);
	
        File file = new File("Student.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("1 Mohitur\n");
        writer.write("2 Sayan\n");
        writer.close();

        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        
		// Search a record from the file
		FileReader searchReader = new FileReader(file);
		BufferedReader searchBr = new BufferedReader(searchReader);

		String searchLine;

		while ((searchLine = searchBr.readLine()) != null) {
			String[] parts = searchLine.split(" ");
			int rollNumber = Integer.parseInt(parts[0]);
			if (rollNumber == 3) { // Searching for record with roll number 2
				System.out.println("Found: " + parts[1]);
				break;
			}
		}

		searchBr.close();
    }
}
