/*
 * 예제 4-8 : 인자로 배열이 전달되는 예
 * 작성일: 2020년 10월 6일(화)
 * 학번: 20184014
 * 이름: 이승준
 */

public class ArrayParameterEx {

	static void replaceSpace(char a[]) {
		for (int i=0; i<a.length; ++i)
			if (a[i] == ' ')
				a[i] = ',';
	}
	
	static void printCharArray(char a[]) {
		for (int i=0; i<a.length; ++i)
			System.out.print(a[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}