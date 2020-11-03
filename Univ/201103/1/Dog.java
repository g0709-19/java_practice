
public class Dog extends Animal {
	
	private String type;
	
	public Dog() {
		this("이름없음", "타입없음");
	}
	
	public Dog (String type) {
		this("이름없음", type);
	}
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("%s의 %s", type, name);
	}
	
	// 짖기 메서드
	public void bark() {
		super.introduce();
		System.out.println("멍멍!");
	}

}
