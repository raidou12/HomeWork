package Binario;

public class TestIn {

	private String num1 = "";
	private String num2 = "";
	private Boolean negative = false;
	private String answer = "";

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
		int number1 = Integer.parseInt(num1, 2);
		int number2 = Integer.parseInt(num2, 2);
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

}
