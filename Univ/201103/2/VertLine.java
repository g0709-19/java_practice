
public class VertLine extends AbstLine {
	public void print() {
		System.out.printf("VertLine(length:%d)\n", length);
		for (int i=0; i<length; ++i)
			System.out.println("|");
	}
}
