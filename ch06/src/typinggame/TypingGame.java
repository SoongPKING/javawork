package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 영어 단어가 랜덤하게 화면에 출제되면 타이핑하기
		// 오타가 없으면 "통과", 오타가 있으면 "다시 도전"
		// 10문제 수행
		// 시간 측정

		String[] words = { "ant", "bear", "chicken", "dog", "elephant", "frog", "giraffe", "horse", "iguana", "jaguar",
				"koala", };

		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("영어 타자 게임. 준비되면 엔터");
		sc.nextLine();
		double start =System.currentTimeMillis();

		while (n < 11) {
			// 단어 출제
			int rand = (int) (Math.random() * words.length);
			System.out.println("문제 " + n);
			String question = words[rand];
			System.out.println(question);
			// 단어 입력
			String answer = sc.nextLine(); // 사용자 입력

			if (question.equals(answer)) {
				System.out.println("통과입니다.");
				n++;
			} else {
				System.out.println("오답. 다시 도전하세요.");
			}	
		}
		
		double end = System.currentTimeMillis();
		System.out.printf("게임 시간: %.2f초\n", (end-start)/1000);
		sc.close();
	}
}
