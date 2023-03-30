import java.util.Scanner;

class series2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		double sum = 0;
	
		System.out.println("Enter total number of terms: ");
		int n = sc.nextInt();
	
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
	
		for(i=0; i<n; i++){
			sum = sum + (1/Math.pow(x,i));
		}
	
		System.out.println("Sum of the series: " + sum);
	}
}