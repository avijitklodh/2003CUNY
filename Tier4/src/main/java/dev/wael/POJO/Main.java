package dev.wael.POJO;

import java.io.Console;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath math = new MyMath();
		int[] array = { 1, 2, 3, 4 };

		int sum = math.getSumArray(array);
		System.out.println(sum);

		System.out.println(math.isArmstrong(407));

	}

}
