/*
 * 예제 4-6 : Circle 객체 배열 만들기
 * 작성일: 2020년 10월 6일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		
		for (int i=0; i<c.length; ++i)
			c[i] = new Circle(i);
		
		for (int i=0; i<c.length; ++i)
			System.out.print((int)(c[i].getArea()) + " ");
	}
}