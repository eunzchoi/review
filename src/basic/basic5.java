package basic;

public class basic5 {
	private void output() {
		// ���� �޼��� ������ ���� ���� �̸��� ����� �� ����.
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
	//main�� ���� ���� �ͺ��� �̷��� ����� �� ���� ���Ƿ� ���� �ʿ���
}
