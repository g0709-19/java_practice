import java.util.Scanner;

public abstract class AbstLine implements Shape {
	protected int length;
	
	public void input(Scanner scanner) {
		System.out.print("���̴�: ");
		length = scanner.nextInt();
	}
}