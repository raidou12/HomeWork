package Binario;

public class Subtract extends Sum {
	Transform call = new Transform();
	
	public void subitract(){
		call.decimal();
		sum1 = call.getBinaryValue1();
		sum2 = call.getBinaryValue2();
		answer = sum1 - sum2;
		System.out.println(">> "+Integer.toBinaryString(answer));
	}
}
