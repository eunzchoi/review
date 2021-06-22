package Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamArray {
	public static void main(String[] args) {
		// ArrayList �÷��� ����
		List<String> arr = new ArrayList<String>();
		
		// ArrayList �Է�
		// add(�߰� �� ���)
		arr.add("������");
		// ArrayList ��� - ���� ���
		System.out.println(arr.get(0));
		
		arr.add("����ȣ");
		System.out.println(arr.get(1));
		
		// ArrayList ��� ������ ��� - arr�� �����ɶ����� s�� �ѱ��.
		for(String s : arr) {
			System.out.println(s);
		}
//		���� ��¹��� ���� �����
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		// ArrayList �߰� ������ �Է� - ���̿� ��
		// add(index��, �߰� �� ���)
		arr.add(1, "���þ�");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// ArrayList ������ ����
		arr.set(1, "�־Ƹ�");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// ��ü ���� ���� Ȯ�� - true or false
		System.out.println(arr.contains("������")); // true
		System.out.println(arr.contains("���þ�")); // false
		
		// �ش� �ε����� � ��ü�� ����Ǿ����� Ȯ��
		System.out.println(arr.get(1));
		
		// �÷����� ����ִ��� Ȯ�� - true or false
		System.out.println(arr.isEmpty()); // false
		
		// ��ü������, �ٸ� �߰����� ����
		ArrayList<String> nothing = new ArrayList<>();
		System.out.println(nothing.isEmpty()); // true
		
		// �÷��ǿ� ����� ��ü �� Ȯ��
		System.out.println(arr.size());
		
		// �ش� �ε����� ����� ��ü ����
		arr.remove(1);
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// �ش� ��ü ����
		arr.remove("����ȣ");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		// �÷��ǿ� ����Ǿ� �ִ� ��� ��ü ����
		arr.clear();
		
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
