import java.util.Scanner;

class Number {
  int[] arr;

  Number(int n) {
    arr = new int[n];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter " + n + " numbers:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
  }

  void display() {
    System.out.println("Numbers in the array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

class OddNum extends Number {
  int[] oddArr;

  OddNum(int n) {
    super(n);
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        count++;
      }
    }
    oddArr = new int[count];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        oddArr[j] = arr[i];
        j++;
      }
    }
  }

  void displayOdd() {
    System.out.println("Odd numbers in the array:");
    for (int i = 0; i < oddArr.length; i++) {
      System.out.print(oddArr[i] + " ");
    }
    System.out.println();
  }
}

class PrimeNum extends OddNum {
  int[] primeArr;

  PrimeNum(int n) {
    super(n);
    int count = 0;
    for (int i = 0; i < oddArr.length; i++) {
      if (isPrime(oddArr[i])) {
        count++;
      }
    }
    primeArr = new int[count];
    int j = 0;
    for (int i = 0; i < oddArr.length; i++) {
      if (isPrime(oddArr[i])) {
        primeArr[j] = oddArr[i];
        j++;
      }
    }
  }

  void displayPrime() {
    System.out.println("Prime numbers in the array:");
    for (int i = 0; i < primeArr.length; i++) {
      System.out.print(primeArr[i] + " ");
    }
    System.out.println();
  }

  boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}

public class AS16Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    PrimeNum pNum = new PrimeNum(n);
    pNum.display();
    pNum.displayOdd();
    pNum.displayPrime();
  }
}