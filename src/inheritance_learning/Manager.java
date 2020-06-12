package inheritance_learning;
/**
 * Manager类
 * 学习继承extends; super调用超类的构造方法;super调用超类的方法
 * 子类不能访问超类的私有字段，可以用super。方法来访问
 * 子类的方法，不能低于超类的方法的可见性
 * 如果Manager不允许扩展，final类，可以用public final class Manager extends Employee
 * @author NanQue
 *
 */

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	// 子类的方法，不能低于超类的方法的可见性，所以这里不能用
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
	

}
