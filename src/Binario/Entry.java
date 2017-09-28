package Binario;

import java.util.Scanner;

public class Entry {

	Scanner in = new Scanner(System.in);

	private String num1 = "";
	private String num2 = "";
	private Boolean negative = false;
	private String answer = "";
	private char rest = '0';

	public void ask() {
		System.out.println("Primeiro numero(brinario)");
		setNum1(in.nextLine());
		System.out.println("Segundo numero(brinario)");
		setNum2(in.nextLine());
		setAnswer("");
	}

	public void testLength() {
		boolean equals = true;
		while (equals == true) {
			if (getNum1().length() == getNum2().length()) {
				equals = false;
			} else if (num1.length() < num2.length()) {
				setNum1("0" + getNum1());
				equals = true;
			} else {
				setNum2("0" + getNum2());
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
			setNum2(replace);
			setNum1(replace2);
			setNegative(true);
		}

	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public Boolean getNegative() {
		return negative;
	}

	public void setNegative(Boolean negative) {
		this.negative = negative;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public char getRest() {
		return rest;
	}

	public void setRest(char rest) {
		this.rest = rest;
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
