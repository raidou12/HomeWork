package Binario;

import java.util.Scanner;

public class Operations extends TestIn {
	Scanner in = new Scanner(System.in);
	private char rest = '0';

	public void ask() {
		System.out.println("Primeiro numero(brinario)");
		setNum1(in.nextLine());
		System.out.println("Segundo numero(brinario)");
		setNum2(in.nextLine());
		setAnswer("");
	}

	public void addition() {
		ask();
		testLength();
		for (int i = getNum1().length() - 1; i >= 0; i--) {
			if (getNum1().charAt(i) == '0' && getNum2().charAt(i) == '0') {
				if (rest == '0') {
					setAnswer("0" + getAnswer());
				} else {
					rest = '0';
					setAnswer("1" + getAnswer());
				}
			} else if (getNum1().charAt(i) == '1' && getNum2().charAt(i) == '0'
					|| getNum1().charAt(i) == '0' && getNum2().charAt(i) == '1') {
				if (rest == '0') {
					setAnswer("1" + getAnswer());
				} else {
					rest = '1';
					setAnswer("0" + getAnswer());
				}
			} else if (getNum1().charAt(i) == '1' && getNum2().charAt(i) == '1') {
				if (rest == '0') {
					rest = '1';
					setAnswer("0" + getAnswer());
				} else {
					rest = '1';
					setAnswer("1" + getAnswer());
				}
			}
		}
		if (rest == '1') {
			setAnswer(rest + getAnswer());
		}
		System.out.println(getNum1() + "\n+ " + getNum2() + "\n" + getAnswer());

	}

	public void subtract() {
		ask();
		testLength();
		if (getNum1().equals(getNum2())) {
			setAnswer("0");
		} else {
			testNegative();
			for (int i = getNum1().length() - 1; i >= 0; i--) {
				if (getNum1().charAt(i) == '0' && getNum2().charAt(i) == '0') {
					if (rest == '0') {
						setAnswer("0" + getAnswer());
					} else {
						setAnswer("1" + getAnswer());
					}
				} else if (getNum1().charAt(i) == '1' && getNum2().charAt(i) == '1') {
					if (rest == '0') {
						setAnswer("0" + getAnswer());
					} else {
						rest = '0';
						setAnswer("1" + getAnswer());
					}
				} else if (getNum1().charAt(i) == '1' && getNum2().charAt(i) == '0') {
					if (rest == '0') {
						setAnswer("1" + getAnswer());
					} else {
						rest = '0';
						setAnswer("0" + getAnswer());
					}
				} else {
					if (rest == '0') {
						rest = '1';
						setAnswer("1" + getAnswer());
					} else {
						setAnswer("0" + getAnswer());
					}
				}
			}
		}
		if (getNegative() == true) {
			setAnswer("-" + getAnswer());
			System.out.println(getNum2() + "\n- " + getNum1() + "\n" + getAnswer());
		} else {
			System.out.println(getNum1() + "\n- " + getNum2() + "\n" + getAnswer());
		}
	}
}
