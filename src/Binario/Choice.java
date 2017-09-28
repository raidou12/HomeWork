package Binario;
import java.util.Scanner;
public class Choice extends Operations{

	public Choice(String num1, String num2, Boolean negative, String answer, char rest) {
		super(num1, num2, negative, answer, rest);
		// TODO Auto-generated constructor stub
	}

	Scanner in = new Scanner(System.in);
	
	public void choice() {
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
