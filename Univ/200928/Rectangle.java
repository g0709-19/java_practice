/*
 * 예제 4-1: Rectangle 클래스 만들기 연습
 * 작성일: 2020년 9월 28일(월)
 * 학번: 20184014
 * 이름: 이승준
 */

import java.util.Scanner;

public class Rectangle {

	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();	// 객체 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		int area = rect.getArea();
		System.out.println("사각형의 면적은 "+area);
		
		scanner.close();
	}

}
