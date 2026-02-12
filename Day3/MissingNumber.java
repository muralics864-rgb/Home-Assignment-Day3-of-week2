package Week2.Day3;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] misNum = { 1, 4,3,2,8, 6, 7 }; // number stored in array

		Arrays.sort(misNum); // number sorted to descenting order so the maximum 

		int maxVal = misNum[misNum.length - 1];

		int forMula = maxVal * (maxVal + 1) / 2;

		int sum = 0;

		for (int i = 0; i < misNum.length; i++) {
			sum += misNum[i];
		}
		System.out.println("Missing Number is " + (forMula - sum));

	}

}
