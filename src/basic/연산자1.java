package basic;

public class ������1 {
	public static void main(String[] args) {
		// ��� ������ ************************
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2); // ->3
		// �ǿ����ڰ� ������ ��� ������� ����
		System.out.println(num1%num2);
		
		//��ȣ *******************************
		int num3 = -10;
		System.out.println(num3);
		num3 = +10;
		System.out.println(num3);
		
		// ���ڿ� ������ ***********************
		String str1 = "����";
		String str2 = "�ؾ���";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+str2);
		String str3 = str1 + str2;
		System.out.println(str3);
		System.out.println("�� �ȿ� ���ȴ� ��ƴ���� �� ���� �־�"
				+ " ������ �� �� �ƴ� ǳ��������"
				+ " ���ݸ� ��ٸ��� �� ������ �� ��");
		//EnterŰ�� �ٹٲ��ϸ� �ڵ����� +�� �̾���
		
		// ���� ������ *************************
		
		// = : �����ʿ� ����� ������� ���ʿ� ����
		int num4 = 10; // -> 10�� ���� num4��
		// += : �����ʿ� ����� ������� ������ ���ؼ� ����
		num4 += 10; // -> num4 = num4 + 10;
		System.out.println(num4); // -> 20
		num4 += 10*3; // num = num + 10 * 3;
		System.out.println(num4); // -> 50
		// -= : �����ʿ� ����� ������� ������ �� �� ����
		num4 -= 10; // num = num - 10;
		System.out.println(num4); // -> 40
		// *=, /=, %=
		
		
		
	}
}
