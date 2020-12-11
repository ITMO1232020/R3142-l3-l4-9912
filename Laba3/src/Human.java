import java.util.Objects;

public class Human implements Thinker {
	private String name;
	private Mest mest;
	public Human(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}

	public void print() {
		System.out.print(getName()+" ");
	}
	public void startCreate() {
		System.out.print("����� ��������� ");
	}
	public void think(String how) {
		if (how=="FAST") {
			System.out.print("������� ");
		}
		switch(mest) {
		case ��:
			System.out.print("����� ");
			break;
		case ���:
			System.out.print("������ ");
			break;
		case ���:
			System.out.print("������ ");
			break;
		case ���:
			System.out.print("����� ");
			break;
		}
	}
	public void thinkDeliever() {
		switch(mest) {
		case ��:
			System.out.print("������c� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		}
		
	}
	public void thinkLaunch() {
		switch(mest) {
		case ��:
			System.out.print("������c� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		case ���:
			System.out.print("��������� ������, ��� ��������� ");
			break;
		}
	}
	public void finishedThink(String How) {
		if (How=="LONG") {
			System.out.print("� ���������� ������ ����������� ");
		}
		switch(mest) {
		case ��:
			System.out.print("��������� ");
			break;
		case ���:
			System.out.print("���������� ");
			break;
		case ���:
			System.out.print("���������� ");
			break;
		case ���:
			System.out.print("���������� ");
			break;
		}
	}
	public void notThink(String how) {
		if (how=="ONLY") {
			System.out.print("������������, �� ���� ");
		}
		System.out.print("�� ������ ���������� " + getName());
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Human human = (Human) o;
		return Objects.equals(name, human.name) &&
				mest == human.mest;
	}

	public int hashCode() {
		return Objects.hash(name, mest);
	}

	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", mest=" + mest +
				'}';
	}

}
