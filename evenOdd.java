class evenOdd {

	public static int[] separate(int[] arr) {
		int evens = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[evens] = arr[evens] + arr[i];
				arr[i] = arr[evens] - arr[i];
				arr[evens] = arr[evens] - arr[i];

				evens++;
 			}
		}

		return arr;
	}

	public static void main(String args[]) {
		int[] arr1 = {1, 4, 3, 5, 6, 7 ,8, 10, 11};
		int[] result = evenOdd.separate(arr1);

		for (int n: result) {
			System.out.print(n + " ");
		}
	}
}