package Binario;

import java.util.Scanner;

public class Choice {

	int choice = 0;
	
	Scanner in = new Scanner(System.in);
	Subtract subtract = new Subtract();
	Addition addition = new Addition();
	
	public void choice1() {
		System.out.println("Escolha 1- para de Binario para Decimal\nEscolha 2- para de Decimal para Brinario");
		choice = in.nextInt();
		if (choice == 1) {
			choice2();
			if (choice == 1 ) {
				addition.addition();
			}else if (choice == 2) {
				subtract.subtract();
			}
		}else if (choice == 2) {
			
		}else {
			choice1();
		}
	}
	
	public void choice2() {
		System.out.println("Escolha 1- para de Adição\nEscolha 2- Subtração");
		choice = in.nextInt();
		if (choice == 1 || choice == 2) {
			return;
		}else {
			choice1();
		}
	}

}
