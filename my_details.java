import java.util.*;

class my_details {
	public static void main(String[] args){
		String name = "Mohitur";
		int age = 22;
		int new_age = age + (age % 10);
		int prev_age = age - (age/10);
		System.out.println("My name: " + name);
		System.out.println("My current age: " + age);
		System.out.println("My next age: " + new_age);
		System.out.println("My previous age: " + prev_age);
	}
}
