/*
 * ���� 3-13 : main()���� ����� ������ �� ���
 */

public class Calc {
	public static void main(String[] args)
	{
		double sum = 0.0;
		
		// ���� ������ŭ �ݺ�
		for (int i=0; i<args.length; ++i)
			sum += Double.parseDouble(args[i]); // ���ڿ��� �Ǽ�(double Ÿ��)�� ��ȯ�Ͽ� �ջ�
		
		System.out.println("sum = " + sum);
	}
}
