import java.util.Scanner;

class series4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		double sum = 0;
	
		System.out.print("Enter total number of terms: ");
		int n = sc.nextInt();
		
		for(i=1; i<=n; i++){
			if(i%2==0){
				sum = sum + (Math.pow(i,3));
			} else{
				sum = sum + (Math.pow(i,2));
			}	
		}
	
		System.out.println("Sum of the series: " + sum);
	}
}