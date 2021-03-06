/*
 * 예제 4-4 : 생성자 선언 및 활용 연습
 * 작성일: 2020년 9월 30일(수)
 * 학번: 20184014
 * 이름: 이승준
 */

public class Book {

	String title;
	String author;
	
	public Book(String t) { // 생성자
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) { // 생성자
		title = t;
		author = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}
