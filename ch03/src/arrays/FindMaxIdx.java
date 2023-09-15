package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		// 최대값의 위치를 0번으로 설정
		int[] arr = new int[] {1, 5, 8, 3, 2};
		int maxIdx = 0;
		
		for(int i=1; i<arr.length; i++) {
			if (arr[i]>arr[maxIdx]) {
				maxIdx=i;
			}
		}
		System.out.println(arr[maxIdx]);
		System.out.println("최대값의 위치: "+maxIdx);

	}

}
