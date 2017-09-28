package Binario;

public class BinToDec {

	String binario = "";
	private int takevalue;
	private int multiplication = 0;
	private int convert = 0;
	private int answer = 0;

	public void BinToDec() {
		answer = 0;
		int control = getBinario().length() - 1;
		for (int i = getBinario().length() - 1; i >= 0; i--) {
			if (control == i) {
				multiplication = 1;
				if (getBinario().charAt(i) == '0') {
					takevalue = 0;
				} else {
					takevalue = 1;
				}
				convert = takevalue * 1;
				answer = convert + answer;
			} else {
				if (getBinario().charAt(i) == '0') {
					takevalue = 0;
				} else {
					takevalue = 1;
				}
				multiplication = 2 * multiplication;
				convert = takevalue * multiplication;
				answer = convert + answer;
			}

		}
		setAnswerToBinary(answer);
		return;
	}

	public String getBinario() {
		return binario;
	}

	public void setBinario(String binario) {
		this.binario = binario;
	}

	public int getAnswerToBinary() {
		return answer;
	}

	public void setAnswerToBinary(int answer) {
		this.answer = answer;
	}
}
