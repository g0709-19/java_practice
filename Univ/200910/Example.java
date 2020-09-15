import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] titles = {
			"예제 2-4", "예제 2-5", "예제 2-6", "예제 2-7"	
		};
		
		ExClass[] examples = {
				new ScannerEx(),
				new ArithmeticOperator(),
				new AssignmentIncDecOperator(),
				new LogicalOperator()
		};
		
		for (int i=0; i<examples.length; ++i) {
			System.out.println(titles[i]);
			examples[i].run(scanner);
			System.out.println();
		}
		
		scanner.close();
	}
}

interface ExClass {
	public void run(Scanner scanner);
}

class ScannerEx implements ExClass {
	public void run(Scanner scanner) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		String name = scanner.next();
		String city = scanner.next();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		boolean single = scanner.nextBoolean();
		System.out.printf(""
				+ "이름은 %s, 도시는 %s, 나이는 %d살, 체중은 %.1fkg, 독신 여부는  %b입니다.\n"
				, name, city, age, weight, single);
	}
}

class ArithmeticOperator implements ExClass {
	public void run(Scanner scanner) {
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.printf("%d초는 %d시간, %d분, %d초입니다.\n",
				time, hour, minute, second);
	}
}

class AssignmentIncDecOperator implements ExClass {
	public void run(Scanner scanner) {
		int a = 3, b = 3, c = 3;
		
		a += 3;
		b *= 3;
		c %= 2;
		System.out.printf("a=%d, b=%d, c=%d\n", a, b, c);
		
		int d = 3;
		
		a = d++;
		System.out.printf("a=%d, d=%d\n", a, d);
		a = ++d;
		System.out.printf("a=%d, d=%d\n", a, d);
		a = d--;
		System.out.printf("a=%d, d=%d\n", a, d);
		a = --d;
		System.out.printf("a=%d, d=%d\n", a, d);
	}
}

class LogicalOperator implements ExClass {
	public void run(Scanner scanner) {
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));

		System.out.println((3 > 2) && (3 > 4));
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}