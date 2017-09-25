package Binario;
import java.util.Scanner;

public class Choice extends Operations{
	public void choice() {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha 1 - Adição\nEscolha 2 - Subtração");
		int choice = in.nextInt();
		if (choice == 1) {
			addition();
		} else if (choice == 2) {
			subtract();
		} else {
			choice();
		}
	}
	
}
