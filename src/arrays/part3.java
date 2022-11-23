package arrays;

import java.util.Arrays;

public class part3 {

	private static void toPower(int size, int power) {
		int[] array1 = new int[size];
		for (int i = 0; i < array1.length; i++) {
			int a = i;
			int b = power;
			array1[i] = (int) Math.pow(a, b);

		}
		System.out.println(Arrays.toString(array1));
	}

	public static void main(String[] args) {

		toPower(4, 2);
	}

}
