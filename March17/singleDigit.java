import java.util.Scanner;

class singleDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
        	int n = sc.nextInt();
		int sum = 0;
        	while (n > 0 || sum > 9){
            		if (n == 0) {
                		n = sum;
				sum = 0;                	
            		}
            		sum += n % 10;
            		n /= 10;
        	}
        System.out.println("Single digit is: " + sum);
    }
}