
public class Rocket implements Rider {
	private String name;
	private Mest mest;
	public Rocket(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void print() {
    	System.out.print(getName()+" ");
    }
	public void freeRide() {
		switch(mest) {
		case ��:
			System.out.print(mest + " ��� �������� �������� ");
			break;
		case ���:
			System.out.print(mest + " ����� �������� �������� ");
			break;
		case ���:
			System.out.print(mest + " ����� �������� �������� ");
			break;
		case ���:
			System.out.print(mest + " ����� �������� �������� ");
			break;		
		}
	}
}
