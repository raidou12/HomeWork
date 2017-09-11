package Binario;

import java.util.Scanner;

public class Interface {
	Scanner in = new Scanner(System.in);
	private int catchValueBinary1;
	private int catchValueBinary2;
	
	public Interface(){
		int catchValueBinary1 = 0 ;
		int catchValueBinary2 = 0;
	}
	
	//Methods
	public void ask_binary_code(){
		System.out.print("Número Binario 1 >> ");
		setCatchValueBinary1(in.nextInt());
		System.out.print("Número Binario 2 >> ");
		setCatchValueBinary2(in.nextInt());
	}	
	
	//Set and Get
	public int getCatchValueBinary1() {
		return catchValueBinary1;
	}
	public void setCatchValueBinary1(int catchValueBinary1) {
		this.catchValueBinary1 = catchValueBinary1;
	}
	public int getCatchValueBinary2(){
		return catchValueBinary2;
	}
	public void setCatchValueBinary2(int CatchValueBinary2){
		this.catchValueBinary2 = CatchValueBinary2;
	}
}
