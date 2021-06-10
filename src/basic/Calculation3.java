package basic;

public class Calculation3 {
	public static void main(String[] args) {
		int n1 = 10; // 정수형
		double n2 = 3.5; // 실수형
		//int result = n1 + n2; 는 불가
		//int result = (int) (n1 + n2); // 강제 타입변환
		double result = n1 + n2; //자동 타입변환
		System.out.println(result);
		result = n1 - n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		char c1 = '한';
		int n3 = c1;
		System.out.println(n3);
	}
}
