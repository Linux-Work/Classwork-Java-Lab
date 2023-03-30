class employee{
	public static void main(String[] args){
		double basic_salary = 12000;
		double hra = (0.15*basic_salary);
		double da = (1.1*basic_salary);
		double pf = (0.12*basic_salary);
		double gross_salary = hra + da + basic_salary + pf;
		double net_salary = gross_salary - pf;
		System.out.println("Net Salary: " + net_salary);
		System.out.println("Gross Salary: " + gross_salary);
	}
}