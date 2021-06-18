package test;

public class TestMain {
	public static void main(String[] args) {
		Test t = new Test();
		t.setNum(100);
		System.out.println(t.getNum());
		
		TestService ts = new TestService();
		// () 값을 넣지 않음 - 매개변수 없음
		// ts.aaa() 실행하고 저장하지 않음 - 반환 받는 값 없음
		ts.aaa(); 
		
		// () 값을 넣지 않음 - 매개변수 없음
		// ts.bbb() 실행하고 저장하지 않았는데 에러가 발생하지 않음
		// 반환 받는 값을 저장하거나 안해도 문제가 생기지 않음
		// 반환 받는 값이 반드시 필요하면 변수 또는 객체를 이용해서 저장해야함
		int num = ts.bbb();
		System.out.println(num);
		
		// () 값을 넣은 것은 매개변수가 있다는 의미
		// ts.ccc(num) 실행하고 저장하지 않음 - 반환값은 없음
		ts.ccc(num);
		System.out.println(num);
		
		num = ts.ddd(num);
		System.out.println(num);
	}
}
