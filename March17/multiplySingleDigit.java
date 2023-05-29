import java.util.Scanner;

class multiplySingleDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
        	long n = sc.nextInt();
		long prod = 1;
        	while (n > 0 || prod > 9) {
            		if (n == 0) {
                		n = prod;
                		prod = 1;
            		}
            		prod *= n % 10;
            		n /= 10;
        	}
        System.out.println("Single digit is: " + prod);
    }
}