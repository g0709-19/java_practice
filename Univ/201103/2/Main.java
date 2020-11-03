/*
 * ���α׷���: �������̽� �̿��� ���� Ŭ���� �׽�Ʈ
 * �ۼ���: 2020�� 11�� 3��(ȭ)
 * �й�: 20184014
 * �̸�: �̽���
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ����: ");
		int amount = scanner.nextInt();
		Shape[] shapes = new Shape[amount];
		
		for (int i=0; i<amount; ++i) {
			System.out.printf("%d�� ������ ����(1.��/2.����/3.������/4.�簢��): ", i+1);
			int input = scanner.nextInt();
			Shape shape;
			switch (input) {
			case 1: shape = new Point(); break;
			case 2: shape = new HorzLine(); break;
			case 3: shape = new VertLine(); break;
			case 4: shape = new Rectangle(); break;
			default:
				System.out.println("1~4 ������ ���ڸ� �Է����ּ���.");
				--i;
				continue;
			}
			shape.input(scanner);	// ������ �ʿ��� �Է°��� �ִٸ� �߰� �Է� ����
			shapes[i] = shape;
		}
		
		for (int i=0; i<amount; ++i) {
			shapes[i].print();
			System.out.println();
		}
		
		scanner.close();
	}

}
