package entities;

public class TaxPayer {
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer() {
		
	}
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	public Double getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	public Double getServicesIncome() {
		return servicesIncome;
	}
	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	public Double getCapitalIncome() {
		return capitalIncome;
	}
	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	public Double getHealthSpending() {
		return healthSpending;
	}
	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	public Double getEducationSpending() {
		return educationSpending;
	}
	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salary = salaryIncome / 12;
		if(salary < 3000.00) {
			return salary = 0.0;
		}
		else if(salary < 5000.00) {
			return salary = 12 * (salary * 0.1);
		}
		else {
			return salary = 12 * (salary * 0.2);
		}
	}
	public double servicesTax() {
		double services = servicesIncome;
		if(services > 0.0) {
			return services * 0.15;
		}
		else {
			return 0.0;
		}

	}
	public double capitalTax() {
		double capital = capitalIncome;
		if(capital > 0.0) {
			return capital * 0.20;
		}
		else {
			return 0.0;
		}

	}
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	public double taxRebate() {
		double gastos = healthSpending + educationSpending;
		double maxAbatimento = grossTax() * 0.3;
		if(gastos <= maxAbatimento) {
			return gastos;
		}
		else {
			return grossTax() * 0.3;
		}
	}
	public double netTax() {
		return grossTax() - taxRebate();
	}
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + "\n" +
				"Abatimento: " + String.format("%.2f", taxRebate()) + "\n" +
				"Imposto devido: " + String.format("%.2f", netTax());
				
	}

	
}
