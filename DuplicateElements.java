package array;

public class DuplicateElements {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 3, 3, 4, 5 };
		removeDuplicates(arr);
	}

	private static void removeDuplicates(int[] arr) {
		if(arr.length == 0) {
			System.out.println();
		}
		int i = 1, j = 1;
		int temp = arr[0];
		while (j < arr.length) {
			if (temp == arr[j]) {
				j++;
				continue;
			} else {
				temp =  arr[j];
			}
			arr[i++] = arr[j++];
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(i);
	}
}
