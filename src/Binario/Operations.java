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
<<<<<<< HEAD

		testLength();
=======
		}

	/*public void subtract() {
>>>>>>> dbe905f045153e61cd9553a2be6611cdbe1d4bfe
		
		for (int i = num1.length() - 1; i >= 0; i--) {
			if (num1.charAt(i) == '0' && num2.charAt(i) == '0') {
				System.out.println("if1");
				System.out.println("resto" + rest);
				if (rest == '0') {
					answer = "0" + answer;
				} else {
					rest = '0';
					answer = "1" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '0'
					|| num1.charAt(i) == '0' && num2.charAt(i) == '1') {
				System.out.println("if2");
				System.out.println("resto" + rest);
				if (rest == '0') {
					answer = "1" + answer;
				} else {
					rest = '1';
					answer = "0" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '1') {
				System.out.println("if3");
				System.out.println("resto" + rest);
				if (rest == '0') {
					rest = '1';
					answer = "0" + answer;
				} else {
					rest = '1';
					answer = "1" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			}

		}
		if (rest == '1') {
			answer = rest + answer;
		}
		System.out.println(num1 + "\n+ " + num2 + "\n" + answer);

<<<<<<< HEAD
	}

	public void subtract() {
=======
	}*/

	
	public void subtract(){
>>>>>>> dbe905f045153e61cd9553a2be6611cdbe1d4bfe
		Scanner in = new Scanner(System.in);
		System.out.println("Primeiro numero(brinario)");
		num1 = in.nextLine();
		System.out.println("Segundo numero(brinario)");
		num2 = in.nextLine();
		answer = "";
		char rest = '0';

		testLength();
		testNegative();

		for (int i = num1.length() - 1; i >= 0; i--) {
<<<<<<< HEAD
			if (num1.charAt(i) == '0' && num2.charAt(i) == '0') {
				System.out.println("if1");
				System.out.println("resto" + rest);
				if (rest == 0) {
					answer = "0" + answer;
				}else {
					answer = "1" + answer;
				}
				

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '1') {
				System.out.println("if2");
				System.out.println("resto" + rest);
				if (rest == '0') {
=======

			if (num1.charAt(i) == '0' && num2.charAt(i) == '0' || num1.charAt(i) == '1' && num2.charAt(i) == '1') {
				if (num2.charAt(i) == '0') {

			if (num1.charAt(i) == '0' && num2.charAt(i) == '0' || num1.charAt(i) == '1' && num2.charAt(i) == '1' ) {
				if (num2.charAt(i)== '0') {

					rest = '0';
>>>>>>> dbe905f045153e61cd9553a2be6611cdbe1d4bfe
					answer = "0" + answer;
				} else {
					rest = '0';
					answer = "1" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			} else if (num1.charAt(i) == '1' && num2.charAt(i) == '0') {
				System.out.println("if3");
				System.out.println("resto" + rest);
				if (rest == '0') {
					answer = "1" + answer;
				} else {
					rest = '0';
					answer = "0" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			} else {
				System.out.println("if4");
				System.out.println("resto" + rest);
				System.out.println(i);
				if (rest == '0') {
					rest = '1';
					answer = "1" + answer;
				}else {
					answer = "0" + answer;
				}

				System.out.println("num1" + num1.charAt(i));
				System.out.println("num2" + num2.charAt(i));
				System.out.println("resto dps" + rest);
				System.out.println("resposta" + answer);
				System.out.println("");
			}

		}
<<<<<<< HEAD
		if (negative == true) {
=======
		if (rest == '1') {
			answer = "-" + answer;
		}
		System.out.println(num1 + "\n- " + num2 + "\n" + answer);
		if (rest == '1'){
>>>>>>> dbe905f045153e61cd9553a2be6611cdbe1d4bfe
			answer = "-"+answer;
			System.out.println(num2 + "\n- " + num1 + "\n" + answer);
		}else {
			System.out.println(num1 + "\n- " + num2 + "\n" + answer);
		}
<<<<<<< HEAD
=======
		System.out.println(num1+"\n- "+num2+"\n"+answer);
		
			}
		}
>>>>>>> dbe905f045153e61cd9553a2be6611cdbe1d4bfe
	}
}
