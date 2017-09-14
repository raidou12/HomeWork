package Binario;

public class Subtract extends Transform {
	
	public void subtract(){
		run();
		sum1 = getBinaryValue1();
		sum2 = getBinaryValue2();
		answer = sum1 - sum2;
		System.out.println(">> "+Integer.toBinaryString(answer));
	}
}
