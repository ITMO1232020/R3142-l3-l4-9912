
public class Main {
	public static void main(String[] args) {
		Human kubik = new Human("�����", Mest.��);
		Human vintikandshpuntik = new Human("������ � �������", Mest.���);
		Moon moon = new Moon("����");
		Cave cave = new Cave("������");
		Cave othercave = new Cave("������ ������");
		Stone granit = new Stone("������");
		Stone otherstone = new Stone("�����-������ ������ �������� ������");
		Entrance entrance = new Entrance("���� � ������");
		WallsFloor wallsfloor = new WallsFloor("����� � ������� ������");
		Inners inners = new Inners("������������ ������");
		Rocket rocket = new Rocket("������", Mest.���);
		RocketPart wheels = new RocketPart("������");
		RocketPart tale = new RocketPart("�����");
		Trubolet trubolet = new Trubolet("���������� ��������� ��������");
		Wall wall = new Wall("�������������������� ������", Mest.���);
		Door door = new Door("������������ ������������� �����", Mest.���);
		Sluice sluice = new Sluice("�������� ����������", Mest.���);
		SolarBatteries solarbatteries = new SolarBatteries("��������� �������", Mest.���);
		Electricity electricity = new Electricity("��������������");
		
		kubik.print();
		kubik.think("FAST"); 
		System.out.print("� ");
		kubik.startCreate();
		Project.print("LONG");
		cave.print();
		moon.print(Predlog.��);
		System.out.println("");
		
		Project.print("THIS");
		entrance.found();
		wall.print();
		System.out.print("� ������� ");
		door.place();
		System.out.print(" � ");
		sluice.place();
		System.out.println(" ����� ���� ");
		cave.fill();		
		System.out.println("");
		
		wallsfloor.facing();
		granit.print();
		System.out.print("��� ");
		otherstone.print();
		System.out.println("");
		
		System.out.print("����� � ");
		cave.print();
		moon.cover(Predlog.��);
		solarbatteries.place();
		solarbatteries.produce();
		electricity.print();
		electricity.light();
		System.out.print("� ");
		electricity.heat();
		cave.print();
		System.out.println("");
		
		inners.convert("SLow");
		System.out.println(": ");
		Room.appear("�������", Mest.���);
		Room.appear("��������", Mest.���);
		Room.appear("����", Mest.���);
		Room.appear("�������", Mest.���);
		Room.appear("�����", Mest.���);
		Room.appear("���������� �����", Mest.���);
		Room.appear("�������", Mest.���);
		Room.appear("������", Mest.���);
		Room.appear("���������������", Mest.���);
		Room.appear("������-����������������� ���������", Mest.���);
		Room.appear("��������� �������� ������", Mest.���);
		System.out.print(" ��� ����� � ");
		othercave.print();
		System.out.println("");
		
		Project.improve("FAST");
		System.out.println("");
		
		vintikandshpuntik.print();
		vintikandshpuntik.thinkDeliever();
		System.out.print("� ");
		cave.print();
		rocket.print();
		System.out.print("� ");
		vintikandshpuntik.thinkLaunch();
		rocket.print();
		moon.print(Predlog.������);
		System.out.println("");
		
		vintikandshpuntik.print();
		vintikandshpuntik.finishedThink("LONG");
		tale.attach();
		System.out.print(" � ");
		wheels.attach();
		System.out.print(" � ");
		rocket.print();
		System.out.print("����� ");
		rocket.freeRide();
		moon.print(Predlog.��);
		trubolet.like();
		System.out.println("");
		
		vintikandshpuntik.notThink("ONLY");
		System.out.print(" ��� ");
		wheels.whereTake();
		moon.print(Predlog.��);
	}

}
