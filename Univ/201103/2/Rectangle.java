import java.util.Scanner;

public class Rectangle implements Shape {
	
	private int width;
	private int height;
	
	public void input(Scanner scanner) {
		System.out.print("�ʺ�: ");
		width = scanner.nextInt();
		System.out.print("����: ");
		height = scanner.nextInt();
	}
	
	public void print() {
		System.out.printf("Rectangle(width:%d, height:%d)\n", width, height);
		for (int i=0; i<height; ++i) {
			for (int j=0; j<width; ++j)
				System.out.print("*");
			System.out.println();
		}
	}
}
