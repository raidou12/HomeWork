package Binario;
public class Sum extends Transform{
	protected int sum1;
	protected int sum2;
	protected int answer;
	Transform call = new Transform();
	
	//Methods
	public void sum(){
		call.decimal();
		int sum1 = call.getBinaryValue1();
		int sum2 = call.getBinaryValue2();
		int answer = sum1 + sum2;
		System.out.println(">> "+Integer.toBinaryString(answer));

	}
}
