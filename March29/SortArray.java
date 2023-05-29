import java.util.Scanner;

public class SortArray {
    private int[] arr;

    public void allocateMemory(int n) {
        arr = new int[n];
    }

    public void inputNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void showNumbers() {
        System.out.println("The values stored in the array are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public void insertionSort() {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void mergeSort() {
        mergeSortHelper(0, arr.length - 1);
    }

    private void mergeSortHelper(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortHelper(start, mid);
            mergeSortHelper(mid + 1, end);
            merge(start, mid, end);
        }
    }

    private void merge(int start, int mid, int end) {
        int[] tempArr = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }

        while (j <= end) {
            tempArr[k++] = arr[j++];
        }

        for (i = start; i <= end; i++) {
            arr[i] = tempArr[i - start];
        }
    }

    public void quickSort() {
        quickSortHelper(0, arr.length - 1);
    }

    private void quickSortHelper(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSortHelper(low, pivotIndex - 1);
            quickSortHelper(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        SortArray sa = new SortArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size to be allocated: ");
        int size = sc.nextInt();
        sa.allocateMemory(size);
        sa.inputNumbers();

        // sort using bubble sort
        sa.bubbleSort();

        // sort using selection sort
        //sa.selectionSort();

        // sort using insertion sort
        //sa.insertionSort();

        // sort using merge sort
        //sa.mergeSort();

        // sort using quicksort
        //sa.quickSort();

        sa.showNumbers();
    }
}