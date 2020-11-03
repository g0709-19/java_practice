/*
 * 프로그램명: 추상 클래스 이용한 동물 클래스 작성
 * 작성일: 2020년 11월 3일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("뭉치", "치와와");
		dog.bark();
		
		Cat cat = new Cat("마이클", 7);
		cat.bark();
	}
}
