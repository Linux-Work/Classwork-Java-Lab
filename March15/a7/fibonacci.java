import java.util.Scanner;
class fibonacci {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
	int first = 0, second = 1, temp;
      	if (num == 0){
      		System.out.println("n-th term: " + first);
	}
      	if (num == 1){
      		System.out.println("n-th term: " + second);
	}
	for (int i = 2; i <= num; i++){
		temp = first + second;
        	first = second;
        	second = temp;
      	}  
      	System.out.println("n-th term: " + second);
    }
}