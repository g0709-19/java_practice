
public abstract class Animal {
	protected String name;	// ������ �̸� �ʵ�
	
	public Animal() {
		this("�̸�����");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	// �̸� ����
	public abstract String toString();
	
	// ¢�� �޼���
	public void introduce() {
		System.out.print(toString() + "�̴�.");
	}
}
