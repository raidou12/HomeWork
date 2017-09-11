package Binario;

public class Transform {
	private int BinaryValue1;
	private int BinaryValue2;
	Interface call = new Interface();
	
	public Transform(){
		BinaryValue1 = 0;
		BinaryValue2 = 0;
	}
	
	public void decimal(){
		call.ask_binary_code();
		String catchIt = "" + call.getCatchValueBinary1();
		String catchIt2 = "" + call.getCatchValueBinary2();
		setBinaryValue1(Integer.parseInt(catchIt, 2));
		setBinaryValue2(Integer.parseInt(catchIt2, 2));
		System.out.println(getBinaryValue1());
		System.out.println(getBinaryValue2());
	}
	
	
	public int getBinaryValue1() {
		return BinaryValue1;
	}
	public void setBinaryValue1(int binaryValue1) {
		BinaryValue1 = binaryValue1;
	}
	public int getBinaryValue2() {
		return BinaryValue2;
	}
	public void setBinaryValue2(int binaryValue2) {
		BinaryValue2 = binaryValue2;
	}
	
}
