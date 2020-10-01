package array;

public class EvenNumbers {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 12, 134, 6789, 257 };
		for (int x : arr) {
			if (getNumberOfDigits(x) % 2 == 0) {
				count++;
			}
		}
		System.out.println("Count = " + count);
	}

	private static int getNumberOfDigits(int x) {
		int digits = 0;
		while (x != 0) {
			digits++;
			x = x / 10;
		}
		return digits;
	}

}
