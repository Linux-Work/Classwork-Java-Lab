import java.util.Scanner;

class TwoDArray {
    int[][] array;
    int rows = 2;

    public TwoDArray(int n) {
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

    public OneDArray[] splitArray() {
        OneDArray[] oneDArrays = new OneDArray[rows];
        for (int i = 0; i < rows; i++) {
            oneDArrays[i] = new OneDArray(array[i]);
        }
        return oneDArrays;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int commonDimension = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < commonDimension; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
}

class OneDArray {
    int[] array;

    public OneDArray(int n) {
        array = new int[n];
    }

    public OneDArray(int[] arr) {
        this.array = arr.clone();
    }

    public void show() {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column size: ");
        int n = sc.nextInt();

        TwoDArray twoDArray = new TwoDArray(n);
        twoDArray.inputData();

        System.out.println("2D Array:");
        twoDArray.displayArray();

        System.out.println("Split 1D Arrays:");
        OneDArray[] oneDArrays = twoDArray.splitArray();
        for (OneDArray oneDArray : oneDArrays) {
            oneDArray.show();
        }

        // Create another TwoDArray object
        System.out.println("Enter data for the second 2D array:");
        TwoDArray twoDArray2 = new TwoDArray(n);
        twoDArray2.inputData();

        // Add the two 2D arrays
        int[][] addedMatrix = TwoDArray.addMatrices(twoDArray.array, twoDArray2.array);

        System.out.println("Added matrix:");

        for (int[] row : addedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Multiply the two 2D arrays
        int[][] multipliedMatrix = TwoDArray.multiplyMatrices(twoDArray.array, twoDArray2.array);

        System.out.println("Multiplied matrix:");

        for (int[] row : multipliedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}