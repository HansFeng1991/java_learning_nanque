package abstract_class_learning;


/**
 * 学习抽象类
 */
public class abstractTest {
	public static void main(String[] args) {
		// 抽象类不能直接实例化
		var people = new Person[2];
		
		people[0] = new Employee("Hans", 4000, 1991, 12, 15);
		people[1] = new Student("Feng", "IE");
		
		for (Person p : people) {
			System.out.println(p.getName()+", "+p.getDescription());
			System.out.println(p);
		}
		
	}

}
