
public class Moon {
	private String name;
	public Moon(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
    public void print(Predlog predlog) {
    	switch (predlog) {
    	case ��:
    		System.out.print(predlog+" ���� ");
    		break;
    	case ������:
    		System.out.print(predlog+" ���� ");
    		break;
    	case ��:
    		System.out.print(predlog+" ���� ");
    		break;
    	}
    }
    public void cover(Predlog predlog) {
    	switch (predlog) {
    	case ��:
    		System.out.print(predlog+" ������ ����������� ");
    		break;
    	case ������:
    		System.out.print(predlog+" ������ ����������� ");
    		break;
    	case ��:
    		System.out.print(predlog+" ������ ����������� ");
    		break;
    	}
    }

}
