package Binario;
import java.util.Scanner;

public class Operations {
	public void addition() {
		Scanner in = new Scanner(System.in);
		System.out.println("Primeiro numero(brinario)");
		String num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		String num2 = in.nextLine();
		String answer = "";
		char rest = '0';
		
		for (int i = num1.length() - 1; i >= 0; i--) {
			if (num1.charAt(i) == '0' && num2.charAt(i) == '0') {
				if (rest == '0') {
					answer = "0" + answer;
				} else {
					answer = "1" + answer;
				}
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '0'
					|| num1.charAt(i) == '0' && num2.charAt(i) == '1') {
				if (rest == '0') {
					answer = "0" + answer;
				} else {
					rest = '1';
					answer = "1" + answer;
				}
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '1') {
				if (rest == '0') {
					rest = '1';
					answer = "0" + answer;
				} else {
					answer = "1" + answer;
				}
			}

		}
		if (rest == '1'){
			answer = rest+answer;
		}
		System.out.println(num1+"\n+ "+num2+"\n"+answer);

	}
	
	public void subtract(){
		Scanner in = new Scanner(System.in);
		System.out.println("Primeiro numero(brinario)");
		String num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		String num2 = in.nextLine();
		String answer = "";
		char rest = '0';

		for (int i = num1.length() - 1; i >= 0; i--) {
			if (num1.charAt(i) == '0' && num2.charAt(i) == '0' || num1.charAt(i) == '1' && num2.charAt(i) == '1' ) {
				if (num2.charAt(i)== '0') {
					rest = '0';
					answer = "0" + answer;
				} else {
					rest = '1';
					answer = "1" + answer;
				}
			} else if (num1.charAt(i) == '1' && rest == '0') {
				rest = '0';
				if (num2.charAt(i) == '0') {
					answer = "1" + answer;
				} else {
					answer = "0" + answer;
				}
			} else if (num1.charAt(i) == '1' && rest == '1') {
				rest = '1';
				if (num2.charAt(i) == '0') {
					answer = "1" + answer;
				} else {
					answer = "0" + answer;
				}
			}

		}
		if (rest == '1'){
			answer = "-"+answer;
		}
		System.out.println(num1+"\n- "+num2+"\n"+answer);

	}
}
