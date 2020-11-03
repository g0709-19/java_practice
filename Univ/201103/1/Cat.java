
public class Cat extends Animal {
	
	private int age;
	
	public Cat() {
		this("이름없음", 0);
	}
	
	public Cat (int age) {
		this("이름없음", age);
	}
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%d살의 %s", age, name);
	}
	
	// 짖기 메서드
	public void bark() {
		super.introduce();
		System.out.println("야옹!");
	}
	
}
