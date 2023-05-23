// StackOperations.java
import java.util.Scanner;
import java.util.Arrays;

interface StackOperations {
    void push(int item);
    int pop();
    int peek();
}

class MyStack implements StackOperations {
    private int[] stackArray;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.stackArray = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stackArray[top] = item;
            System.out.println("Pushed " + item + " onto the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            int poppedItem = stackArray[top];
            top--;
            System.out.println("Popped " + poppedItem + " from the stack.");
            return poppedItem;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            System.out.println("Top element is " + stackArray[top]);
            return stackArray[top];
        }
    }

    public String toString() {
        return Arrays.toString(stackArray);
    }
}

public class AS19Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = input.nextInt();
        MyStack stack = new MyStack(capacity);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = input.nextInt();
                    stack.push(element);
                    System.out.println(stack);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println(stack);
                    }
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println(stack);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
