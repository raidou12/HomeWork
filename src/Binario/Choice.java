package Binario;
import java.util.Scanner;

public class Choice extends Operations{
	public void choice() {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha 1 - Adi��o\nEscolha 2 - Subtra��o");
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
