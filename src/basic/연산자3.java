package basic;

public class 연산자3 {
	public static void main(String[] args) {
		// 비교 연산자 : true, false 의 결과값이 나옴
		int num1 = 5;
		int num2 = 10;
		int num3 = 5;
	
		
		// 같다 : ==
		System.out.println(num1 == num3); // -> true
		System.out.println(num1 == num2); // -> false
		
		// 다르다(같지않다) : != (기호 순서 바뀌면 안됨)
		System.out.println(num1 != num2); // -> true
		System.out.println(num1 != num3); // -> false
		
		// 크다 : >
		System.out.println(num2 > num1); // -> true
		System.out.println(num3 > num2); // -> false
		
		// 작다 : <
		System.out.println(num1 < num2); // -> true
		System.out.println(num2 < num3); // -> false
		
		// 크거나 같다 : >= (기호 순서 바뀌면 안됨)
		System.out.println(num2 >= num1); // -> true
		System.out.println(num1 >= num3); // -> true
		System.out.println(num3 >= num2); // -> false
		
		// 작거나 같다 : <= (기호 순서 바뀌면 안됨)
		System.out.println(num1 <= num2); // -> true
		System.out.println(num1 <= num3); // -> true
		System.out.println(num2 <= num3); // -> false
		
		boolean b = num1 < num2;
		System.out.println(b); // -> true
	}
}
