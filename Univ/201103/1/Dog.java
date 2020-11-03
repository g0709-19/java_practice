
public class Dog extends Animal {
	
	private String type;
	
	public Dog() {
		this("�̸�����", "Ÿ�Ծ���");
	}
	
	public Dog (String type) {
		this("�̸�����", type);
	}
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("%s�� %s", type, name);
	}
	
	// ¢�� �޼���
	public void bark() {
		super.introduce();
		System.out.println("�۸�!");
	}

}
