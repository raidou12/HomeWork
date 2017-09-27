package Binario;

import java.util.Scanner;

public class Operations extends TestIn {
	public void addition() {
		Scanner in = new Scanner(System.in);
		System.out.println("Primeiro numero(brinario)");
		num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		num2 = in.nextLine();
		answer = "";
		char rest = '0';

		testLength();

		for (int i = num1.length() - 1; i >= 0; i--) {
			if (num1.charAt(i) == '0' && num2.charAt(i) == '0') {
				if (rest == '0') {
					answer = "0" + answer;
				} else {
					rest = '0';
					answer = "1" + answer;
				}
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '0'
					|| num1.charAt(i) == '0' && num2.charAt(i) == '1') {
				if (rest == '0') {
					answer = "1" + answer;
				} else {
					rest = '1';
					answer = "0" + answer;
				}
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '1') {
				if (rest == '0') {
					rest = '1';
					answer = "0" + answer;
				} else {
					rest = '1';
					answer = "1" + answer;
				}
			}
		}
		if (rest == '1') {
			answer = rest + answer;
		}
		System.out.println(num1 + "\n+ " + num2 + "\n" + answer);

	}

	public void subtract() {
		Scanner in = new Scanner(System.in);
		System.out.println("Primeiro numero(brinario)");
		num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		num2 = in.nextLine();
		answer = "";
		char rest = '0';

		testLength();

		if (num1.equals(num2)) {
			answer += "0";
		} else {
			testNegative();
			for (int i = num1.length() - 1; i >= 0; i--) {
				if (num1.charAt(i) == '0' && num2.charAt(i) == '0') {
					if (rest == '0') {
						answer = "0" + answer;
					} else {
						answer = "1" + answer;
					}
				} else if (num1.charAt(i) == '1' && num2.charAt(i) == '1') {
					if (rest == '0') {
						answer = "0" + answer;
					} else {
						rest = '0';
						answer = "1" + answer;
					}
				} else if (num1.charAt(i) == '1' && num2.charAt(i) == '0') {
					if (rest == '0') {
						answer = "1" + answer;
					} else {
						rest = '0';
						answer = "0" + answer;
					}
				} else {
					if (rest == '0') {
						rest = '1';
						answer = "1" + answer;
					} else {
						answer = "0" + answer;
					}
				}
			}
		}
		if (negative == true) {
			answer = "-" + answer;
			System.out.println(num2 + "\n- " + num1 + "\n" + answer);
		} else {
			System.out.println(num1 + "\n- " + num2 + "\n" + answer);
		}
	}
}
