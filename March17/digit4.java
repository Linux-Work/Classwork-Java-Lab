import java.util.Scanner;

class digit4{
	public static void main(String[] args){
		for(int i = 1000; i <= 9999; i++){
			int remainder1, remainder2, finalAnswer = 0;
    			remainder1 = i % 100;
    			remainder2 = i /100;
    			finalAnswer = (remainder1 + remainder2)*(remainder1 + remainder2);

			if(finalAnswer == i){
				System.out.println("Number: " + finalAnswer);
			}
		}
	}
}