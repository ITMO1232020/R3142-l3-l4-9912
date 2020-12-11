
public class RocketPart {
	private String name;
	public RocketPart(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void attach() {
		System.out.print("��������� "+getName());
	}
	public void whereTake() {
		System.out.print("��� ����� "+getName()+" ");
	}
	public void print() {
		System.out.print(getName());
	}
}
