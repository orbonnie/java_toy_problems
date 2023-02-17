public class rotateArr {

	public static int[] rotate(int[] arr) {
		if (arr.length < 2) return arr;

		int[] rotated = new int[arr.length];

		if (arr.length == 2) {
			arr[0] = arr[0] + arr[1];
			arr[1] = arr[0] - arr[1];
			arr[0] = arr[0] - arr[1];
		}

		for (int i = 0; i < arr.length; i++) {
			if (i > arr.length - 3) {
				int idx = i - arr.length + 2;
				rotated[idx] = arr[i];
			} else {
				rotated[i + 2] = arr[i];
			}
		}

		return rotated;
	}


	public static void main(String args[]) {
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {55, 6, -1, 7, 100};
		int[] arr3 = {1, 2};
		int[] arr4 = {5, 65, 0};

		int[] r1 = rotateArr.rotate(arr1);
		int[] r2 = rotateArr.rotate(arr2);
		int[] r3 = rotateArr.rotate(arr3);
		int[] r4 = rotateArr.rotate(arr4);

		for (int n: r1) {
			System.out.print(n + " ");
		}
		System.out.println("\n");

		for (int n: r2) {
			System.out.print(n + " ");
		}
		System.out.println("\n");

		for (int n: r3) {
			System.out.print(n + " ");
		}
		System.out.println("\n");

		for (int n: r4) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
	}

}
