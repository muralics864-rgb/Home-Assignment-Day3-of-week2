package Week2.Day3;

public class FindIntersection {

	public static void main(String[] args) {

		int[] array1 = { 3, 2, 11, 4, 6, 7 }; //initializing two arrays
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < array1.length; i++) { //looping through array1
			for (int j = 0; j < array2.length; j++) { // looping through array2
				if (array1[i] == array2[j]) { // finding whether any value of array1 is present in array 2
					System.out.println(array2[i]); // if it is match printing the matched value

				}

			}
		}

	}

}
