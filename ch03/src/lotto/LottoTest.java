package lotto;

public class LottoTest {

	private static LottoTest lottoTest;

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45-6개추출
		int[] lotto=new int [6];
		
		//lotto[0] = (int)(Math.random()*45 +1);
		//System.out.println(lotto[0]);
		
		// 6개 동시에 생성
		for(int i = 0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45 +1);
			
			// 중복 문제 해결
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
		}
		for(int i = 0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		LottoTest.lottoTest = new LottoTest();
		System.out.println(lottoTest);
	}

}
