/*
 * 예제 4-9 : 가비지의 발생
 * 작성일: 2020년 10월 6일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

public class GarbageEx {

	public static void main(String[] args) {
		String a= new String("Good"); // 가비지
		String b= new String("Bad");
		String c = new String("Normal");
		String d, e;
		a = null;
		d = c;
		c = null;
	}

}