package algorithm;

public class RankTest {

	public static void main(String[] args) {
		// 순위 정하기
		// 1, 1, 1, 1, 1 로 만들기
		int[] score = { 70, 90, 60, 50, 80 };
		int[] rank = new int[5]; // 0, 0, 0, 0, 0

		for (int i = 0; i < score.length; i++) {
			int count = 1;

			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j])
					count++;
			}
			rank[i] = count;
		}
		// 순위 출력
		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}

	}

}
