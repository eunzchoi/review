package basic;

public class basic5 {
	private void output() {
		// 같은 메서드 내에서 같은 변수 이름을 사용할 수 없다.
		int num1 = 10; 
		int num2 = 20;
		int result = num1 + num2;
		System.out.println(result);
		result = num2 - num1;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		basic5 b1 = new basic5();
		b1.output();
	}
	//main을 먼저 쓰는 것보다 이러한 방식을 더 많이 쓰므로 적응 필요함
}
