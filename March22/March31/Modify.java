import java.util.Scanner;

class TwoDArray3 {
    int[][] array;
    int rows;

    public TwoDArray3(int m, int n) {
        rows = m;
        array = new int[rows][n];
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
    }

    public void displayArray() {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public OneDArray[] distributeRows() {
        OneDArray[] oneDArrays = new OneDArray[rows];
        for (int i = 0; i < rows; i++) {
            oneDArrays[i] = new OneDArray(array[i]);
        }
        return oneDArrays;
    }

}

class OneDArray3 {
    int[] array;

    public OneDArray3(int n) {
        array = new int[n];
    }

    public OneDArray3(int[] arr) {
        this.array = arr.clone();
    }

    public void show() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Modify {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int m = sc.nextInt();
        System.out.print("Enter column size: ");
        int n = sc.nextInt();

        TwoDArray3 twoDArray3 = new TwoDArray3(m, n);
        twoDArray3.inputData();

        System.out.println("2D Array:");
        twoDArray3.displayArray();

        System.out.println("Distributed 1D Arrays:");
        OneDArray[] oneDArrays = twoDArray3.distributeRows();
        for (OneDArray oneDArray : oneDArrays) {
            oneDArray.show();
        }
    }
}