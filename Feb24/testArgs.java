class testArgs {
	public static void main(String[] args){
		int a,b;
		int sum;
		a = Integer.parseInt(args[0]);
		// a = Double.parseDouble(args[0]);
		b = Integer.parseInt(args[1]);
		sum = a+b;
		System.out.println(sum);
	}
}
