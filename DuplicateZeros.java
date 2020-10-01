package array;

public class DuplicateZeros {
	public static void main(String args[]) {
		int ar[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int countZeros = 0;
		for (int x : ar) {
			if (x == 0) {
				countZeros++;
			}
		}
		if(countZeros > 0) {
			int arr[] = new int[ar.length + countZeros];
			int index = 0;
			for (int x = 0; x < ar.length; x++) {
				arr[index++] = ar[x];
				if (ar[x] == 0) {
					arr[index++] = 0;
				}
			}
			for (int x = 0; x <= ar.length - 1; x++) {
				ar[x] = arr[x];
			}
		}
		for (int x : ar) {
			System.out.println(x);
		}
	}
}
