package Binario;
public class Addition extends Transform{
	
	//Methods
	public void addition(){
		run();
		int sum1 = getBinaryValue1();
		int sum2 = getBinaryValue2();
		int answer = sum1 + sum2;
		System.out.println(">> "+Integer.toBinaryString(answer));
	}
}
