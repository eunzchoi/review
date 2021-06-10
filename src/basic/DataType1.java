package basic;

public class DataType1 {
	public static void main(String[] args) {
		// 정수형 타입
		byte a = 10; // byte : -128 ~ 127 : 1byte
		System.out.println(a);
		short b = 200; // short : -32768 ~ 32767 : 2byte
		System.out.println(b);
		int c = 500; // int : -21억 ~ 21억 : 4byte 정수형 기본형태
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
		
		// 실수형 타입
		float e = 1.2345678f; // f붙여야함 : 4byte
		System.out.println(e);
		double f = 1.2345678; // 8byte 실수형 기본형태
		System.out.println(f);
		
		f = e; // float -> double
		e = (float) f; // double -> float
		
		// 정수타입과 실수타입의 값 저장
		c = (int) e; // double -> int
		System.out.println(c); // -> 1
		// 정수 타입은 실수 타입을 이해하지 못하기 때문에 값이 정수형으로 변경됨
		e = c; // int -> double
		System.out.println(e); // -> 1.0
		
		// 정수타입과 실수타입의 연산
		double result = 100 / 15;
		System.out.println(result); // -> 6.0
		// double로 실수 타입이지만 정수와 정수를 연산하면 정수 결과값이 나옴
		result = 100 / 15.0;
		System.out.println(result); // -> 6.66666...
		
		int num1 = 100;
		int num2 = 15;
		result = (double)num1 / num2;
		System.out.println(result); // 강제변환했으니 값은 실수형-> 6.66666...
		
		// char - 문자, 정수 타입
		char g = 'A';
		// 문자열은 큰따옴표 사용(String), 단일문자는 작은따옴표 사용
		System.out.println(g); // -> A
		g = 65;
		System.out.println(g); // -> A
		g = 97;
		System.out.println(g); // -> a
		// 숫자와 문자 둘다 저장 가능하나 출력 시에는 문자로 출력함
		
		c = g;
		System.out.println(c); // -> 97
		
		// boolean - 참과 거짓만 가지는 자료형
		boolean h = true;
		h = false;
		
	}
}
