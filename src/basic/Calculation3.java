package basic;

public class Calculation3 {
	public static void main(String[] args) {
		int n1 = 10; // ������
		double n2 = 3.5; // �Ǽ���
		//int result = n1 + n2; �� �Ұ�
		//int result = (int) (n1 + n2); // ���� Ÿ�Ժ�ȯ
		double result = n1 + n2; //�ڵ� Ÿ�Ժ�ȯ
		System.out.println(result);
		result = n1 - n2;
		System.out.println(result);
		result = n1 * n2;
		System.out.println(result);
		result = n1 / n2;
		System.out.println(result);
		char c1 = '��';
		int n3 = c1;
		System.out.println(n3);
	}
}
