class celcius{
	public static void main(String[] args){
		double farenheit;
		double celcius;
		farenheit = Double.parseDouble(args[0]);
		celcius = (5.0/9.0)*(farenheit-32.0);
		System.out.println("Celcius Value: " + celcius);
	}
}
