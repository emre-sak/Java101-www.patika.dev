package maasHesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		double tempSalary = this.salary;
		double tax = 1;
		if(this.salary > 1000) {
			tax = tempSalary *= 0.03;
		}
		return tax;
		
	}
	
	public double bonus() {
		double bonus = 1;
		if(this.workHours > 40) {
			bonus = (this.workHours - 40) * 30;
		}
		return bonus;
	}
	
	public double raiseSalary() {
		if((2021 - this.hireYear) < 10) {
			double tempSalary = this.salary;
			return tempSalary *= 0.05;
			
		}else if((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
			double tempSalary = this.salary;
			return tempSalary *= 0.1;
			
		}else {
			double tempSalary = this.salary;
			return tempSalary *= 0.15;
			
		}
	}

	@Override
	public String toString() {
		
		double total = this.salary - tax() + bonus();
		
		return "Adı : " + this.name + "\n" +
			   "Maaşı : " + this.salary + "\n" +
			   "Çalışma saati : " + this.workHours + "\n" +
			   "Başlangıç yılı : " + this.hireYear + "\n" +
			   "Vergi : " + tax() + "\n" +
			   "Bonus : " + bonus() + "\n" +
			   "Maaş Artışı : " + raiseSalary() + "\n" +
			   "Bonuslarla birlikte maaş artışı : " + total + "\n" +
			   "Toplam Maaaş : " + (total + raiseSalary());
	}
	
	
}
