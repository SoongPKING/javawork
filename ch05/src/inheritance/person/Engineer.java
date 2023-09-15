package inheritance.person;

//Engineer가 Person을 상속받음
public class Engineer extends Person{
	int companyId;
	
	public Engineer(String name, int age, int companyId) {
		super(name,age);
		this.companyId = companyId;
		
	}
	public int getCompanyId() {
		return companyId;
	}

}
