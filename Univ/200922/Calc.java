/*
 * 예제 3-13 : main()에서 명령행 인자의 합 계산
 */

public class Calc {
	public static void main(String[] args)
	{
		double sum = 0.0;
		
		// 인자 개수만큼 반복
		for (int i=0; i<args.length; ++i)
			sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
		
		System.out.println("sum = " + sum);
	}
}
