package basic;

public class basic4 {
	int num = 10; // 클래스 변수
	
		public static void main(String[] args) {
			int num = 100; // 메서드 변수, 우선 순위 높음
			int result = num + 10;
			System.out.println(result);
			//값은 110으로 나옴
		}
}
