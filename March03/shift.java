class shift {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Left shift " + b + " bits: " + (a<<b));
		System.out.println("Right shift " + b + " bits: " + (a>>b));
		System.out.println("Right(>>>) shift " + b + " bits: " + (a>>>b));
	}
}