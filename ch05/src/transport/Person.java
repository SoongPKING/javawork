package transport;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 버스를 탄다
	public void takeBus(Bus bus) {
		bus.take(1500);
		this.money -= 1500;
		
	}
	public void takeSubway(Subway subway) {
		subway.take(1300);
		this.money -=1300;
	}
	
	// 사람의 정보
	public void showPersonInfo() {
		System.out.println(name+"님의 남은 돈은 "+ money+ "원 입니다.");
	}
}
