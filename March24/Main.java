import java.util.*;

class ArrayClass2 {
    int[] array;
    int size;

    public ArrayClass2(int size) {
        this.size = size;
        array = new int[size];
        Arrays.fill(array, 0);
    }

    public void inputElements() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + i + "]: ");
            array[i] = sc.nextInt();
        }
        sc.close();
    }

    public void displayArray() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void calculateSumAndAverage() {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        double average = (double) sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public void swapMaxMinElements() {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] < array[minIndex])
                minIndex = i;
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }

    public void findUniqueOccurrences() {
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        for (int element : array) {
            occurrencesMap.put(element, occurrencesMap.getOrDefault(element, 0) + 1);
        }

        System.out.println("Unique elements occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public int makeSingleDigit(int num) {
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public void findGreatestThreeDigitNumber() {
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < size - 2; i = i + 3) {
            int first = makeSingleDigit(array[i]);
            int second = makeSingleDigit(array[i + 1]);
            int third = makeSingleDigit(array[i + 2]);

            int threeDigitNum = first * 100 + second * 10 + third;

            if (threeDigitNum > greatest) {
                greatest = threeDigitNum;
            }
        }

        System.out.println("Greatest three-digit number: " + greatest);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        ArrayClass2 arrObj = new ArrayClass2(n);

        arrObj.inputElements();

        System.out.println("Array elements:");
        arrObj.displayArray();

        // arrObj.calculateSumAndAverage();

        // arrObj.swapMaxMinElements();

        // System.out.println("Array after swapping max and min elements:");
        // arrObj.displayArray();

        // arrObj.findUniqueOccurrences();

        arrObj.findGreatestThreeDigitNumber();
        arrObj.displayArray();
        sc.close();
    }
}