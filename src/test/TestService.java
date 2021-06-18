package test;

public class TestService {
	// 반환값 없고 매개변수 없는 메서드
	public void aaa() {
		// 호출한 메서드가 값을 전달하지 않고 반환 받지도 않음
		return;
	}
	// 반환값은 있고 매개변수 없는 메서드
	public int bbb() { // 호출한 메서드에서 값을 전달하지 않음
		// 반드시 반환하는 데이터 타입과 동일한 값을 반환
		// 리턴하는 값은 변수에 넣어서 보내도 문제 되지 않음
		int a = 1000;
		return a;
	}
	// 반환값은 없고 매개변수는 있는 메서드
	public void ccc(int num) { // 호출한 메서드에서 값을 전달한 것을 의미함
		// 호출한 메서드에서 사용하는 변수의 이름이 같다하더라도 다른 변수로 이해해야함
		num += 10000;
		System.out.println(num);
	}
	
	// 반환값 있고 매개변수 있는 메서드
	public int ddd(int num) { // 호출한 메서드에서 값을 전달
		num *= 100;
		System.out.println(num);
		return num; // num의 값을 호출한 메서드에게 반환
	}
}
