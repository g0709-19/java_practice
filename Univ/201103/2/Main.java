/*
 * 프로그램명: 인터페이스 이용한 도형 클래스 테스트
 * 작성일: 2020년 11월 3일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("도형의 개수: ");
		int amount = scanner.nextInt();
		Shape[] shapes = new Shape[amount];
		
		for (int i=0; i<amount; ++i) {
			System.out.printf("%d번 도형의 종류(1.점/2.수평선/3.수직선/4.사각형): ", i+1);
			int input = scanner.nextInt();
			Shape shape;
			switch (input) {
			case 1: shape = new Point(); break;
			case 2: shape = new HorzLine(); break;
			case 3: shape = new VertLine(); break;
			case 4: shape = new Rectangle(); break;
			default:
				System.out.println("1~4 사이의 숫자를 입력해주세요.");
				--i;
				continue;
			}
			shape.input(scanner);	// 도형에 필요한 입력값이 있다면 추가 입력 받음
			shapes[i] = shape;
		}
		
		for (int i=0; i<amount; ++i) {
			shapes[i].print();
			System.out.println();
		}
		
		scanner.close();
	}

}
