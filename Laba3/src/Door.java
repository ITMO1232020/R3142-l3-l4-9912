
public class Door extends Innovations {
	private String name;
	private Mest mest;
	public Door(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void place() {
		switch(mest) {
		case ��:
			System.out.print("������� " +getName());
			break;
		case ���:
			System.out.print("�������� "+getName());
			break;
		case ���:
			System.out.print("��������������� "+getName());
			break;
		case ���:
			System.out.print("�������� "+getName());
			break;		
		}
	}
	public void produce() {
		switch(mest) {
		case ��:
			System.out.print(" �������������� ");
			break;
		case ���:
			System.out.print(" �������������� ");
			break;
		case ���:
			System.out.print(" �������������� ");
			break;
		case ���:
			System.out.print(" �������������� ");
			break;		
		}
	}
	public void print() {
		System.out.print(getName()+" ");
	}

}
