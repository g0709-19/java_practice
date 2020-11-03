
public class Cat extends Animal {
	
	private int age;
	
	public Cat() {
		this("�̸�����", 0);
	}
	
	public Cat (int age) {
		this("�̸�����", age);
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%d���� %s", age, name);
	}
	
	// ¢�� �޼���
	public void bark() {
		super.introduce();
		System.out.println("�߿�!");
	}
	
}
