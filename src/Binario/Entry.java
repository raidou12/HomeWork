package Binario;

import java.util.Scanner;

public class Entry {

	Scanner in = new Scanner(System.in);

	protected String num1;
	protected String num2;
	protected Boolean negative;
	protected String answer;
	protected char rest;

	public Entry(final String num1, final String num2, final Boolean negative, final String answer, final char rest) {
		this.num1 = num1;
		this.num2 = num2;
		this.negative = negative;
		this.answer = answer;
		this.rest = rest;
	}

	public void ask() {
		System.out.println("Primeiro numero(brinario)");
		this.num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		this.num2 = in.nextLine();
	}

	public void testLength() {
		boolean equals = true;
		while (equals == true) {
			if (num1.length() == num2.length()) {
				equals = false;
			} else if (num1.length() < num2.length()) {
				num1 = "0" + num1;
				equals = true;
			} else {
				num2 = "0" + num2;
				equals = true;
			}
		}

	}

	public void testNegative() {
		int number1 = binarytodecimal(num1);
		int number2 = binarytodecimal(num2);
		if (number1 < number2) {
			String replace = num1;
			String replace2 = num2;
			num2 = replace;
			num1 = replace2;
			negative = true;
		}

	}

	public int binarytodecimal(String binario) {
		int takevalue;
		int multiplication = 0;
		int convert = 0;
		int answer = 0;

		answer = 0;
		int control = binario.length() - 1;
		for (int i = binario.length() - 1; i >= 0; i--) {
			if (control == i) {
				multiplication = 1;
				if (binario.charAt(i) == '0') {
					takevalue = 0;
				} else {
					takevalue = 1;
				}
				convert = takevalue * 1;
				answer = convert + answer;
			} else {
				if (binario.charAt(i) == '0') {
					takevalue = 0;
				} else {
					takevalue = 1;
				}
				multiplication = 2 * multiplication;
				convert = takevalue * multiplication;
				answer = convert + answer;
			}

		}
		return answer;

	}

}
