package maasHesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax;
	double raise;
	double bonus;
	double tempSalary = salary;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void tax() {
		if(this.salary > 1000) {
			tempSalary = this.salary;
			this.tax = tempSalary *= 0.03;
			
		}
	}
	
	public void bonus() {
		if(this.workHours > 40) {
			this.bonus = (this.workHours - 40) * 30;
		}
	}
	
	public void raiseSalary() {
		if((2021 - this.hireYear) < 10) {
			tempSalary = this.salary;
			this.raise = tempSalary *= 0.05;
			
		}else if((2021 - this.hireYear) > 9 && (2021 - this.hireYear) < 20) {
			tempSalary = this.salary;
			this.raise = tempSalary *= 0.1;
			
		}else {
			tempSalary = this.salary;
			this.raise = tempSalary *= 0.15;
			
		}
	}

	@Override
	public String toString() {
		
		double total = this.salary - this.tax + this.bonus;
		
		return "Adı : " + this.name + "\n" +
			   "Maaşı : " + this.salary + "\n" +
			   "Çalışma saati : " + this.workHours + "\n" +
			   "Başlangıç yılı : " + this.hireYear + "\n" +
			   "Vergi : " + this.tax + "\n" +
			   "Bonus : " + this.bonus + "\n" +
			   "Maaş Artışı : " + this.raise + "\n" +
			   "Bonuslarla birlikte maaş artışı : " + total + "\n" +
			   "Toplam Maaaş : " + (total + this.raise);
	}
	
	
}
