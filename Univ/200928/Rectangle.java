/*
 * ���� 4-1: Rectangle Ŭ���� ����� ����
 * �ۼ���: 2020�� 9�� 28��(��)
 * �й�: 20184014
 * �̸�: �̽���
 */

import java.util.Scanner;

public class Rectangle {

	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();	// ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		int area = rect.getArea();
		System.out.println("�簢���� ������ "+area);
		
		scanner.close();
	}

}
