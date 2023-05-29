class greaterNumber{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Max: " + (a>b?a:b));
		System.out.println("Min: " + (a<b?a:b));
	}
}
