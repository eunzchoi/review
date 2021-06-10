package basic;

public class DataType2 {
	private void output() {
		int num = 10;
		double flo = 3.5;
		
		double result = num + flo;
		System.out.println(result); // -> 13.5
		
		result = num - flo;
		System.out.println(result); // -> 6.5
		
		result = num * flo;
		System.out.println(result); // -> 35.0
		
		result = num * flo;
		System.out.println((int)result); // -> 35
		
		result = num / flo;
		System.out.println(result); // -> 2.85714...
		
		char str = 'วั';
		int strNum = str;
		System.out.println(strNum); // -> 54620
		System.out.println((int)str); // -> 54620
		
	}
	public static void main(String[] args) {
		DataType2 d1 = new DataType2();
		d1.output();
		
	}
}
