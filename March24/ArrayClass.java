import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public int[] arr;
    public int size;

    // Constructor to initialize the array to zero
    public ArrayClass(int size) {
        this.size = size;
        arr = new int[size];
        Arrays.fill(arr, 0);
    }

    // Method to input elements to array
    public void inputElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // Method to display the array elements
    public void displayElements() {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to calculate the sum of the elements
    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method to calculate the average of the elements
    public double calculateAverage() {
        int sum = calculateSum();
        double average = (double) sum / size;
        return average;
    }

    // Method to swap the maximum and minimum elements
    public void swapMaxMin() {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }

    // Method to find the occurrence of all unique elements
    public void findOccurrences() {
        int[] uniqueElements = new int[size];
        int[] occurrences = new int[size];
        int uniqueCount = 0;

        // Iterate through the array and find unique elements and their occurrences
        for (int i = 0; i < size; i++) {
            int j;
            for (j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueElements[j]) {
                    occurrences[j]++;
                    break;
                }
            }
            if (j == uniqueCount) {
                uniqueElements[uniqueCount] = arr[i];
                occurrences[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Display unique elements and their occurrences
        System.out.println("Occurrences of unique elements:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + ": " + occurrences[i]);
        }
    }

    // find Maximum Elements in array
    public int findMax() {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Make all the elements of array three-digits after applying provided
    // conditions
    public void makeThreeDigitsNumbers() {
        int k = 0;
        int num2 = 0, num3 = 0;

        // Calculate the size of the new array
        int newSize = size / 3 + (size % 3 == 0 ? 0 : 1);

        // Create a new array to store three-digit numbers
        int[] newArray = new int[newSize];

        for (int i = 0; i < size; i = i + 3) {
            int num1 = singleDigit(arr[i]);
            if (k == (size / 2) - 1) {
                num2 = 0;
                num3 = 0;
            }
            if (i < size - 1) {
                num2 = singleDigit(arr[i + 1]);
                num3 = singleDigit(arr[i + 2]);
            }
            int number = num1 * 100 + num2 * 10 + num3;
            newArray[k] = number;
            k++;
        }

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= 100 && newArray[i] <= 999) {
                System.out.print(newArray[i] + " ");
            }
        }
    }

    // convert a element to single digit
    public int singleDigit(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of the array:");
        int size = sc.nextInt();
        ArrayClass arr = new ArrayClass(size);
        System.out.println();
        arr.inputElements();
        System.out.println();
        arr.displayElements();
        // int sum = arr.calculateSum();
        // System.out.println("\nSum of elements: " + sum);
        // double average = arr.calculateAverage();
        // System.out.println("\nAverage of elements: " + average);
        // System.out.println();
        // arr.findOccurrences();
        System.out.println();
        arr.makeThreeDigitsNumbers();
        // System.out.println("\nGreatest number: " + arr.findMax());
        // arr.swapMaxMin();
        // System.out.println("\nAfter Swap:");
        // arr.displayElements();
        sc.close();
    }
}