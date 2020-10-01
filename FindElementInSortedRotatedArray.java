package array;

public class FindElementInSortedRotatedArray {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 1, 2 };
		int key = 1;
		int index = findElement(arr, key);
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index = " + index);
		}
	}

	private static int findElement(int[] arr, int key) {
		int pivot = findPivot(arr, 0, arr.length);
		if (pivot == -1) {
			return binarySearch(arr, 0, arr.length - 1, key);
		}

		if (arr[pivot] == key) {
			return pivot;
		}
		if (key >= arr[0]) {
			return binarySearch(arr, 0, pivot - 1, key);
		}
		return binarySearch(arr, pivot + 1, arr.length - 1, key);
	}

	private static int binarySearch(int[] arr, int min, int max, int key) {
		if (max < min) {
			return -1;
		}
		while (min <= max) {
			int mid = (min + max) / 2;
			if (arr[mid] == key) {
				return mid;
			} else {
				if (key < arr[mid]) {
					return binarySearch(arr, min, mid - 1, key);
				} else {
					return binarySearch(arr, mid + 1, max, key);
				}
			}
		}
		return -1;
	}

	private static int findPivot(int[] arr, int min, int max) {
		if (min > max) {
			return -1;
		}
		if (min == max) {
			return min;
		}
		int mid = (min + max) / 2;
		if (mid < max && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (mid > min && arr[mid] < arr[mid + 1]) {
			return mid - 1;
		}
		if (arr[min] >= arr[mid]) {
			return findPivot(arr, min, mid - 1);
		}
		return findPivot(arr, mid + 1, max);
	}

}
