package Binario;

import java.util.Scanner;

public class Operations extends Entry {

	public Operations(String num1, String num2, Boolean negative, String answer, char rest) {
		super(num1, num2, negative, answer, rest);
		
	}

	public void addition() {
		ask();
		testLength();
		for (int i = super.num1.length() - 1; i >= 0; i--) {
			if (super.num1.charAt(i) == '0' && super.num2.charAt(i) == '0') {
				if (super.rest == '0') {
					super.answer = "0" + super.answer;
				} else {
					super.rest='0';
					super.answer="1" + super.answer;
				}
			} else if (super.num1.charAt(i) == '1' && super.num2.charAt(i) == '0'
					|| super.num1.charAt(i) == '0' && super.num2.charAt(i) == '1') {
				if (super.rest == '0') {
					super.answer="1" + super.answer;
				} else {
					super.rest ='1';
					super.answer="0" + super.answer;
				}
			} else if (super.num1.charAt(i) == '1' && super.num2.charAt(i) == '1') {
				if (super.rest == '0') {
					super.rest ='1';
					super.answer="0" + super.answer;
				} else {
					super.rest ='1';
					super.answer="1" + super.answer;
				}
			}
		}
		if (super.rest == '1') {
			super.answer=super.rest + super.answer;
		}
		System.out.println(super.num1 + "\n+ " + super.num2 + "\n" + answer);

	}

	public void subtract() {
		ask();
		testLength();
		if (super.num1.equals(super.num2)) {
			super.answer="0";
		} else {
			testNegative();
			for (int i = super.num1.length() - 1; i >= 0; i--) {
				if (super.num1.charAt(i) == '0' && super.num2.charAt(i) == '0') {
					if (super.rest == '0') {
						super.answer="0" + super.answer;
					} else {
						super.answer="1" + super.answer;
					}
				} else if (super.num1.charAt(i) == '1' && super.num2.charAt(i) == '1') {
					if (super.rest == '0') {
						super.answer="0" + super.answer;
					} else {
						super.rest='0';
						super.answer="1" + super.answer;
					}
				} else if (super.num1.charAt(i) == '1' && super.num2.charAt(i) == '0') {
					if (super.rest == '0') {
						super.answer="1" + super.answer;
					} else {
						super.rest='0';
						super.answer="0" + super.answer;
					}
				} else {
					if (super.rest == '0') {
						super.rest ='1';
						super.answer="1" + super.answer;
					} else {
						super.answer="0" + super.answer;
					}
				}
			}
		}
		if (super.negative == true) {
			super.answer="-" + super.answer;
			System.out.println(super.num2 + "\n- " + super.num1 + "\n" + super.answer);
		} else {
			System.out.println(super.num1 + "\n- " + super.num2 + "\n" + super.answer);
		}
	}
}
