
public class Inners extends Cave{
	private String name;
	public Inners(String name) {
		super(name);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void convert(String how) {
		if (how=="SLOW") {
			System.out.print(getName()+" ���������� ");
		}
		System.out.print("��������������a�� ");
	}
}
