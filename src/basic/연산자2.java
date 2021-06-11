package basic;

public class 연산자2 {
	public static void main(String[] args) {
		// 증감 연산자*************************
		// ++ : 1씩 더하기
		int num = 10;
		num++; // num = num + 1; num += 1;
		System.out.println(num); // -> 11
		// -- : 1씩 빼기
		num--; // num = num - 1; num -= 1;
		System.out.println(num); // -> 10
		
		// 후치 증감 : 뒤에 ++ 사용. 연산을 나중에 함. (출력이 먼저)
		int num2 = 10;
		System.out.println(num2++); // -> 10
		System.out.println(num2--); // -> 11
		System.out.println(num2); // -> 10
		
		// 전치 증감 : 앞에 ++ 사용. 연산을 먼저 함. (연산 후 출력)
		int num3 = 10;
		System.out.println(++num3); // -> 11
		System.out.println(--num3); // -> 10
		System.out.println(num3); // -> 10
		
		System.out.println(num++ + ++num2 - --num3);
		// -> 10 + 11 - 9 = 12
		
	}
}
