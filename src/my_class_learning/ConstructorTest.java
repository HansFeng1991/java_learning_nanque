package my_class_learning;
/*学习类的构造特性：
 * 重载构造器
 * 用this(...)调用另外一个构造器
 * 无参数构造器
 * 对象初始化块
 * 静态初始化块
 * 实例化字段初始化
 */

import java.util.*;


public class ConstructorTest {
	public static void main(String[] string) {
		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Hary", 40000);
		staff[1] = new Employee(6000);
		staff[2] = new Employee();

		for (Employee e : staff) {
			System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());
		}
	}

}

class Employee{
	private static int nextId; // 静态字段（注意与实例字段区分），这个类的实离共享一个静态字段

	private int id;
	private String name = "";  // 显式字段初始化
	private double salary;

	// 静态初始化代码块
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}

	// 初始化块
	{
		id = nextId;
		nextId++;
	}

	// 重载构造方法
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}

	public Employee(double s) {
		// 用this()调用其他构造法
		this("Employee #"+nextId, s);
	}

	// 默认构造法
	public Employee() {
		// name 默认为""
		// salary初始化为0（未赋值时默认）
		// id在初始化代码块中给出
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}

}
