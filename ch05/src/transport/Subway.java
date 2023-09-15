package transport;

public class Subway {
	// 필드
	String lineNumber;
	int passenger;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;

	}

	public void take(int fee) {
		this.money += fee; // 요금을 더해서 수입이 늘어남
		passenger++; // 승객수 증가
	}

	public void showSubwayInfo() {
		System.out.printf("%s 지하철의 수입은 %d원이고 승객 수는 %d명 입니다."
				                             , lineNumber, money, passenger);
	}

}
