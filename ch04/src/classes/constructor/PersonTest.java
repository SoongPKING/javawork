package classes.constructor;

public class PersonTest {

	public static void main(String[] args) {
		// Person 객체 생성
		Person p1 = new Person();
		p1.name = "우영우";
		p1.height = 156.3f;
		p1.weight = 50.2f;
		p1.showPersonInfo();
		
		System.out.println("-----------------");
		
		Person p2 = new Person("손흥민");
		p2.height = 183.2f;
		p2.weight = 76.7f;
		p2.showPersonInfo();
		
		System.out.println("-----------------");
		
		Person p3 = new Person("추신수", 180.3f, 90.1f);
		p3.showPersonInfo();
		
		
	}

}
