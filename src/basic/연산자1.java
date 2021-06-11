package basic;

public class 연산자1 {
	public static void main(String[] args) {
		// 산술 연산자 ************************
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); // ->3
		// 피연산자가 정수일 경우 결과값도 정수
		System.out.println(num1%num2);
		
		//부호 *******************************
		int num3 = -10;
		System.out.println(num3);
		num3 = +10;
		System.out.println(num3);
		
		// 문자열 연산자 ***********************
		String str1 = "복습";
		String str2 = "해야지";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);
		String str3 = str1 + str2;
		System.out.println(str3);
		System.out.println("네 안에 열렸던 문틈으로 본 적이 있어"
				+ " 아직은 별 거 아닌 풍경이지만"
				+ " 조금만 기다리면 곧 만나게 될 걸");
		//Enter키로 줄바꿈하면 자동으로 +로 이어짐
		
		// 대입 연산자 *************************
		
		// = : 오른쪽에 연산된 결과값을 왼쪽에 대입
		int num4 = 10; // -> 10을 변수 num4로
		// += : 오른쪽에 연산된 결과값과 왼쪽을 더해서 대입
		num4 += 10; // -> num4 = num4 + 10;
		System.out.println(num4); // -> 20
		num4 += 10*3; // num = num + 10 * 3;
		System.out.println(num4); // -> 50
		// -= : 오른쪽에 연산된 결과값과 왼쪽을 뺀 후 대입
		num4 -= 10; // num = num - 10;
		System.out.println(num4); // -> 40
		// *=, /=, %=
		
		
		
	}
}
