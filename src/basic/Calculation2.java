package basic;

public class Calculation2 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 15;
		int result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		// 원래 값은 6.666... 이지만 정수형이기 때문에 결과값은 6으로 나옴
	}
}
