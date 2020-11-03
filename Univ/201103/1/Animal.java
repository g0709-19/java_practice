
public abstract class Animal {
	protected String name;	// 동물의 이름 필드
	
	public Animal() {
		this("이름없음");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 이름 게터
	public abstract String toString();
	
	// 짖기 메서드
	public void introduce() {
		System.out.print(toString() + "이다.");
	}
}
