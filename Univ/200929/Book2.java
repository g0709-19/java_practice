/*
 * ���� 4-5 : this()�� �ٸ� ������ ȣ��
 * �ۼ���: 2020�� 9�� 30��(��)
 * �й�: 20184014
 * �̸�: �̽���
 * ���� 4-4 ���� Book Ŭ������ ����Ͽ� Ŭ���� �̸��� Book2 �� �����߽��ϴ�.
 */

public class Book2 {

	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book2() {
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public Book2(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("�����", "�������丮");
		Book2 loveStory = new Book2("������");
		Book2 emptyBook = new Book2();
		loveStory.show();
	}

}
