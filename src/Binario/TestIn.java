package Binario;

public class TestIn {
	
	String num1;
	String num2;
	Boolean negative = false;
	String answer;
	
	public void testLength() {
		boolean equals = true;
		while (equals == true) {
			if (num1.length() == num2.length()) {
				equals = false;
			}else if (num1.length() < num2.length()) {
				num1 = "0"+num1;
				equals = true;
			}else {
				num2 = "0"+num2;
				equals = true;
			}
		}
		
	}
	
	public void testNegative() {
		int number1 = Integer.parseInt(num1, 2);
		int number2 = Integer.parseInt(num2, 2);
		if (number1 < number2){
			String replace = num1;
			String replace2 = num2;
			num2 = replace;
			num1 = replace2;
			negative = true;
		}
		
	}

}
