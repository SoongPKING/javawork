package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 {

	public static void main(String[] args) {
		// 매개변수가 있는 생성자로 user1 인스턴스 생성
		/*
		 * User user1 = new User("sky789", "abc123", "홍길동");
		 * 
		 * System.out.println("아이디: "+user1.getId());
		 * System.out.println("비번: "+user1.getPwd());
		 * System.out.println("이름: "+user1.getName());
		 */

		// 크기가 3인 배열 생성
		User[] users = new User[3];

		// user 3명 객체 생성
		User user1 = new User("sky789", "abc123", "홍길동");
		User user2 = new User("sky234", "ddsc122", "이나영");
		User user3 = new User("sky345", "adfe23", "김철수");

		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		
		
		for(int i = 0; i<users.length; i++) {
			System.out.println(users[i].getId()+","+users[i].getPwd()+","+users[i].getName());
		}

	}

}
