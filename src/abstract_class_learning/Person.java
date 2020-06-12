package abstract_class_learning;
/**
 * 抽象类
 * 包含一或多个抽象方法的类，必须被声明为抽象的
 * 抽象类不能实例化；可以定义抽象类的对象变量，但这样一个变量只能引用非抽象子类的对象
 * @author NanQue
 *
 */

public abstract class Person {
	public abstract String getDescription();
	private String name;

	public Person(String aName) {
		name = aName;
	}
	
	public String getName() {
		return name;
	}
	
}
