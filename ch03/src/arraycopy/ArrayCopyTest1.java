package arraycopy;

public class ArrayCopyTest1 {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		for(int j=0; j<arr2.length; j++) {
			System.out.print(arr2[j]+" ");
		}
		
		// 2.clone() 사용
		int[] arr3=arr2.clone();
		for(int k=0; k<arr3.length; k++) {
			System.out.println(arr3[k]+" ");
		}
	}

}
