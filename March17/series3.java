import java.util.Scanner;

class series3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        	System.out.print("Enter how many term to calculate: ");
        	int n = in.nextInt();
        	double sum = 0.0;
        	for (int i = 1; i <= n; i++) {
            		long factorial = 1;
            		for (int j = 1; j <= i; j++) {
                		factorial *= j;
            		}
            		sum += (1.0 / factorial);
        	}
       		System.out.println("Sum: " + sum);
	}
}