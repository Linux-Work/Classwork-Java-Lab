package listpack;
import nodepack.Node;
import java.util.Scanner;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void displayList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        System.out.print("List: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice = 0;
        while (choice != 4) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add a node to the list");
            System.out.println("2. Display the list");
            System.out.println("3. Create the list");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int data = sc.nextInt();
                    list.addNode(data);
                    break;
                case 2:
                    list.displayList();
                    break;
                case 3:
                    System.out.println("Enter the number of elements:");
                    int n = sc.nextInt();
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                        int element = sc.nextInt();
                        list.addNode(element);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        sc.close();
    }
}


//javac nodepack/Node.java listpack/LinkedList.java
//java listpack.LinkedList
