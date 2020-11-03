/*
 * 자바 연습 시간에 이루어진 5장 복습
 * 작성일: 2020년 10월 27일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

interface Food {
	public void taste();
	
	private void a() {
		System.out.println("숨겨진 메소드");
	}
	
	static void static_test() {
		System.out.println("static 메소드");
	}
	
	default void say_hi() {
		System.out.println("안녕하세요 음식입니다.");
	}
}

class Apple implements Food {
	public void taste() {
		// a(); 못씀
		Food.static_test();
	}
	
	public void own_method() {
		System.out.println("Apple 만의 메소드");
		say_hi();
	}
	
	public void say_hi() {
		System.out.println("안녕하세요 사과입니다.");
	}
}

abstract class Animal {
	protected String name;
	
	public Animal() { name = ""; }
	public Animal(String name) { this.name = name; }
	
	public void run() {
		System.out.println(name + "이 달립니다.");
	}
	
	abstract public void stop();
}

class Horse extends Animal {
	public Horse() { super("말"); }
	
	public void stop() {
		System.out.println(name + "이 멈춥니다.");
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
		apple.say_hi(); // 동적 바인딩
		((Apple)apple).say_hi();
	}
	
}
