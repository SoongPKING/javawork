package dates;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		/*
		LocalDateTime now= LocalDateTime.now();
		System.out.println(now);
		
		//날짜/시간 포멧 설정 - "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter dtFormat= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(dtFormat));
		*/
		// 날짜 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// 시간 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		DateTimeFormatter timeFormat= DateTimeFormatter.ofPattern("HH:mm:ss a");
		System.out.println(time.format(timeFormat));

	}

}
