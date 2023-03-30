import java.util.Scanner;

class series1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of terms: ");
		int n = sc.nextInt();
		double i, sum = 0.0;
      		for (i = 1; i <= n; i++){
       			sum = sum + 1/i;
		}
        System.out.println("Sum is: " + sum);
	}
}