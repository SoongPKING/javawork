package algorithm;

public class SortTest {

	public static void main(String[] args) {
		// 오름 차순 정렬
		// 자리바꾸기 a b temp
		int[] arr = {3,6,8,2,5,4};
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
