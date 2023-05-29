import java.util.*;

public class Array {
    public int[] arr;
    public int size;
    int k = 0;

    // Constructor to initialize the array to zero
    public Array(int size) {
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


//    public int findMax() {
//        int max = arr[0];
//        for (int i = 0; i < size; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }

//    public int makeThreeDigitsNumbers() {
//        int maxNumber = 0;
//        for (int i = 0; i <= size - 3; i++) {
//            int num1 = arr[i] % 10;
//            int num2 = arr[i + 1] % 10;
//            int num3 = arr[i + 2] % 10;
//            if (num1 + num2 + num3 >= 10) {
//                int sum = num1 + num2 + num3;
//                num1 = sum % 10;
//                sum /= 10;
//                num2 = sum % 10;
//                sum /= 10;
//                num3 = sum % 10;
//            }
//            int number = num1 * 100 + num2 * 10 + num3;
//            if (number > maxNumber) {
//                maxNumber = number;
//            }
//        }
//        return maxNumber;
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the size of the array:");
        int size = sc.nextInt();
        Array arr = new Array(size);
        System.out.println();
        arr.inputElements();
        System.out.println();
        arr.displayElements();
        int sum = arr.calculateSum();
        System.out.println("\nSum of elements: " + sum);
        double average = arr.calculateAverage();
        System.out.println("\nAverage of elements: " + average);
        arr.swapMaxMin();
        System.out.println("\nAfter Swap:");
        arr.displayElements();
        System.out.println();
        arr.findOccurrences();
//        int max = arr.makeThreeDigitsNumbers();
//        System.out.println("\nGreatest number: " + max);
    }
}

