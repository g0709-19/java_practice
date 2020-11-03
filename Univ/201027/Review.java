/*
 * �ڹ� ���� �ð��� �̷���� 5�� ����
 * �ۼ���: 2020�� 10�� 27��(ȭ)
 * �й�: 20184014
 * �̸�: �̽���
 */

interface Food {
	public void taste();
	
	private void a() {
		System.out.println("������ �޼ҵ�");
	}
	
	static void static_test() {
		System.out.println("static �޼ҵ�");
	}
	
	default void say_hi() {
		System.out.println("�ȳ��ϼ��� �����Դϴ�.");
	}
}

class Apple implements Food {
	public void taste() {
		// a(); ����
		Food.static_test();
	}
	
	public void own_method() {
		System.out.println("Apple ���� �޼ҵ�");
		say_hi();
	}
	
	public void say_hi() {
		System.out.println("�ȳ��ϼ��� ����Դϴ�.");
	}
}

abstract class Animal {
	protected String name;
	
	public Animal() { name = ""; }
	public Animal(String name) { this.name = name; }
	
	public void run() {
		System.out.println(name + "�� �޸��ϴ�.");
	}
	
	abstract public void stop();
}

class Horse extends Animal {
	public Horse() { super("��"); }
	
	public void stop() {
		System.out.println(name + "�� ����ϴ�.");
	}
}

public class Review {

	public static void main(String[] args) {
		
		Animal a = new Horse();
		a.run();
		a.stop();
		
		Food apple = new Apple();
		apple.taste();
		((Apple)apple).own_method();
		apple.say_hi(); // ���� ���ε�
		((Apple)apple).say_hi();
	}
	
}
