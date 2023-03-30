class swap{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Value of a before swap: " + a);
		System.out.println("Value of b before swap: " + b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("\nUsing bitwise ^ operator");
		System.out.println("Value of a after swap: " + a);
		System.out.println("Value of b after swap: " + b);

		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("\nRestoring original values using +, -");
		System.out.println("Restoring value of a: " + a);
		System.out.println("Restoring value of b: " + b);
		
	}
}