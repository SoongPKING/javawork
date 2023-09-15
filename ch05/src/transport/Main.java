package transport;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
		Person p1 = new Person("홍길동", 10000);
		Person p2 = new Person("김철수", 30000);
		Person p3 = new Person("박영수", 20000);
		Person p4 = new Person("박명수", 340000);
		
		
		// 버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subway2= new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus200);
		p3.takeSubway(subway2);
		p4.takeSubway(subway2);
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		p4.showPersonInfo();
		System.out.println("============================");
		bus100.showBusInfo();
		bus200.showBusInfo();
		subway2.showSubwayInfo();

	}

}
