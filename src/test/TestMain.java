package test;

public class TestMain {
	public static void main(String[] args) {
		Test t = new Test();
		t.setNum(100);
		System.out.println(t.getNum());
		
		TestService ts = new TestService();
		// () ���� ���� ���� - �Ű����� ����
		// ts.aaa() �����ϰ� �������� ���� - ��ȯ �޴� �� ����
		ts.aaa(); 
		
		// () ���� ���� ���� - �Ű����� ����
		// ts.bbb() �����ϰ� �������� �ʾҴµ� ������ �߻����� ����
		// ��ȯ �޴� ���� �����ϰų� ���ص� ������ ������ ����
		// ��ȯ �޴� ���� �ݵ�� �ʿ��ϸ� ���� �Ǵ� ��ü�� �̿��ؼ� �����ؾ���
		int num = ts.bbb();
		System.out.println(num);
		
		// () ���� ���� ���� �Ű������� �ִٴ� �ǹ�
		// ts.ccc(num) �����ϰ� �������� ���� - ��ȯ���� ����
		ts.ccc(num);
		System.out.println(num);
		
		num = ts.ddd(num);
		System.out.println(num);
	}
}
