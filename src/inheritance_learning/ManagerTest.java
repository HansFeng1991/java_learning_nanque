package inheritance_learning;
/**
 * 练习继承
 * 了解多态、动态绑定
 *
 * @author NanQue
 *
 */
public class ManagerTest {
	public static void main(String[] args) {
		// 创建一个manager实例
		Manager boss = new Manager("Carl Cracker", 8000, 1987, 12, 15);
		boss.setBonus(5000);

		// 多态：对象
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Hans", 4000, 1991, 12, 15);
		staff[2] = new Employee("Feng", 5000, 1995, 12, 15);

		// 用instanceof来判定类
		System.out.println("instanceof的用法: "+ (staff[0] instanceof Manager));
		System.out.println("instanceof的用法: "+ (staff[1] instanceof Manager));
		System.out.println("instanceof的用法: "+ (staff[0] instanceof Employee));

		// 多态：变量对象e可以指示多种实际类型的现象；
		// 动态绑定：运行时能够自动选择适当的方法
		for (Employee e : staff) {
			System.out.println("name="+e.getName()+", salary="+e.getSalary());
		}
		
	}

}
