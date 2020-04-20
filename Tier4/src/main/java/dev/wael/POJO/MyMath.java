package dev.wael.POJO;

public class MyMath {

	public int getSumArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;

	}

	public boolean isArmstrong(int number) {
		String numString = Integer.toString(number);
		int len = numString.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			int num = Integer.parseInt("" + numString.charAt(i));
			sum += Math.pow(num, len);

		}
		return (sum == number);

	}

}
