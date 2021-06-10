package basic;

public class DataType1 {
	public static void main(String[] args) {
		// ������ Ÿ��
		byte a = 10; // byte : -128 ~ 127 : 1byte
		System.out.println(a);
		short b = 200; // short : -32768 ~ 32767 : 2byte
		System.out.println(b);
		int c = 500; // int : -21�� ~ 21�� : 4byte ������ �⺻����
		System.out.println(c);
		long d = 1000; // 8byte
		System.out.println(d);
		
		// Promotion
		b = a; // byte -> short
		c = b; // short -> int
		d = c; // int -> double
		
		// Casting
		c = (int) d; // double -> int
		b = (short) c; // int -> short
		a = (byte) b; // short -> byte
		
		// �Ǽ��� Ÿ��
		float e = 1.2345678f; // f�ٿ����� : 4byte
		System.out.println(e);
		double f = 1.2345678; // 8byte �Ǽ��� �⺻����
		System.out.println(f);
		
		f = e; // float -> double
		e = (float) f; // double -> float
		
		// ����Ÿ�԰� �Ǽ�Ÿ���� �� ����
		c = (int) e; // double -> int
		System.out.println(c); // -> 1
		// ���� Ÿ���� �Ǽ� Ÿ���� �������� ���ϱ� ������ ���� ���������� �����
		e = c; // int -> double
		System.out.println(e); // -> 1.0
		
		// ����Ÿ�԰� �Ǽ�Ÿ���� ����
		double result = 100 / 15;
		System.out.println(result); // -> 6.0
		// double�� �Ǽ� Ÿ�������� ������ ������ �����ϸ� ���� ������� ����
		result = 100 / 15.0;
		System.out.println(result); // -> 6.66666...
		
		int num1 = 100;
		int num2 = 15;
		result = (double)num1 / num2;
		System.out.println(result); // ������ȯ������ ���� �Ǽ���-> 6.66666...
		
		// char - ����, ���� Ÿ��
		char g = 'A';
		// ���ڿ��� ū����ǥ ���(String), ���Ϲ��ڴ� ��������ǥ ���
		System.out.println(g); // -> A
		g = 65;
		System.out.println(g); // -> A
		g = 97;
		System.out.println(g); // -> a
		// ���ڿ� ���� �Ѵ� ���� �����ϳ� ��� �ÿ��� ���ڷ� �����
		
		c = g;
		System.out.println(c); // -> 97
		
		// boolean - ���� ������ ������ �ڷ���
		boolean h = true;
		h = false;
		
	}
}
