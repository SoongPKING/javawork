package scores;

import java.util.Scanner;

public class CalcScoreTest {

	public static void main(String[] args) {
		// 성적 입력 프로그램
		Scanner sc = new Scanner(System.in);
		boolean sw = true; // 상태변수
		int studentCount = 0;
		int[] scores = null;
		while (sw) {
			try {
			System.out.println("===============================================");
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("===============================================");

			// 문자를 숫자로 변환
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.print("학생 수: ");
				studentCount = Integer.parseInt(sc.nextLine());
				scores = new int[studentCount]; // 학생수는 배열의 크기
			} else if (menu == 2) { // 배열에 점수 저장
				for (int i = 0; i < scores.length; i++) {
					System.out.print("학생[" + (i + 1) + "]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if (menu == 3) { // 전체 조회
				for (int i = 0; i < scores.length; i++) {
					System.out.print("학생[" + (i + 1) + "]: " + scores[i] + "점\n");
				}
			} else if (menu == 4) {
				int sumVal = 0;
				double avg;
				int maxVal = scores[0];
				for (int i = 0; i < scores.length; i++) {
					sumVal += scores[i];
					if (scores[i] > maxVal) {
						maxVal = scores[i];

					}
				}
				avg = (double) sumVal / scores.length;
				System.out.printf("평균점수:%.2f점\n", avg);
				System.out.println("최고점수:" + maxVal + "점\n");
			} else if (menu == 5) {
				sw = false;
			} else
				System.out.println("지원하지 않는 기능입니다.");
		}
			catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}
			System.out.println("프로그램 종료.");
			sc.close();
		}
	}

