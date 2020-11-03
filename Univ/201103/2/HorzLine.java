
public class HorzLine extends AbstLine {
	public void print() {
		System.out.printf("HorzLine(length:%d)\n", length);
		for (int i=0; i<length; ++i)
			System.out.print("-");
		System.out.println();
	}
}
