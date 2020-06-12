package equals;

/**
 * Employee类
 * 比较普通的一个建类过程
 *
 */

import java.time.*;
import java.util.Objects;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
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

	public boolean equals(Object otherObject) {
		// 如果两个实例的指向一致
		if (this == otherObject) return true;
		if (otherObject == null) {
			return false;
		}

		// 如果类别不一致
		if (getClass() != otherObject.getClass()) {
			return false;
		}
		
		var other = (Employee) otherObject;
		return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);

		
		
	}

}
