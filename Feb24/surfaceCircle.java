class surfaceCircle{
	public static void main(String[] args){
		double radius = Double.parseDouble(args[0]);
		double V,A;
		double pi = 3.14159;
		V = (4.0/3.0)*pi*radius*radius*radius;
		A = 4*pi*radius*radius;
		System.out.println("Volume: " + V);
		System.out.println("Area: " + A);
	}
}
