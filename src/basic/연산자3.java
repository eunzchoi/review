package basic;

public class ������3 {
	public static void main(String[] args) {
		// �� ������ : true, false �� ������� ����
		int num1 = 5;
		int num2 = 10;
		int num3 = 5;
	
		
		// ���� : ==
		System.out.println(num1 == num3); // -> true
		System.out.println(num1 == num2); // -> false
		
		// �ٸ���(�����ʴ�) : != (��ȣ ���� �ٲ�� �ȵ�)
		System.out.println(num1 != num2); // -> true
		System.out.println(num1 != num3); // -> false
		
		// ũ�� : >
		System.out.println(num2 > num1); // -> true
		System.out.println(num3 > num2); // -> false
		
		// �۴� : <
		System.out.println(num1 < num2); // -> true
		System.out.println(num2 < num3); // -> false
		
		// ũ�ų� ���� : >= (��ȣ ���� �ٲ�� �ȵ�)
		System.out.println(num2 >= num1); // -> true
		System.out.println(num1 >= num3); // -> true
		System.out.println(num3 >= num2); // -> false
		
		// �۰ų� ���� : <= (��ȣ ���� �ٲ�� �ȵ�)
		System.out.println(num1 <= num2); // -> true
		System.out.println(num1 <= num3); // -> true
		System.out.println(num2 <= num3); // -> false
		
		boolean b = num1 < num2;
		System.out.println(b); // -> true
	}
}
