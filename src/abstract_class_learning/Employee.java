package abstract_class_learning;

/**
 * Employee类
 * 从Person抽象类继承；超类中的抽象方法，子类必须实现
 *
 */

import java.time.*;

public class Employee extends Person {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	// 超类中的抽象方法，子类必须要实现
	public String getDescription() {
		return String.format("An employee with a ssalary of $%.2f", salary);
	}

}
