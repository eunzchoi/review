package basic;

public class ������2 {
	public static void main(String[] args) {
		// ���� ������*************************
		// ++ : 1�� ���ϱ�
		int num = 10;
		num++; // num = num + 1; num += 1;
		System.out.println(num); // -> 11
		// -- : 1�� ����
		num--; // num = num - 1; num -= 1;
		System.out.println(num); // -> 10
		
		// ��ġ ���� : �ڿ� ++ ���. ������ ���߿� ��. (����� ����)
		int num2 = 10;
		System.out.println(num2++); // -> 10
		System.out.println(num2--); // -> 11
		System.out.println(num2); // -> 10
		
		// ��ġ ���� : �տ� ++ ���. ������ ���� ��. (���� �� ���)
		int num3 = 10;
		System.out.println(++num3); // -> 11
		System.out.println(--num3); // -> 10
		System.out.println(num3); // -> 10
		
		System.out.println(num++ + ++num2 - --num3);
		// -> 10 + 11 - 9 = 12
		
	}
}
