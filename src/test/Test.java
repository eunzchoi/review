package test;

public class Test {
	// ������ ���� ���¸� ����� ���� Ŭ����
	// private �� �̿��Ͽ� �����͸� ���� �������� ����
	// public, protected, default(�ƹ��͵� �Ⱦ��°�), private
	private int num;
	
	// ���� ��ȯ�ϴ� �޼���, �Ű������� ���� �����ϴ� �޼���
	// getter, setter ��� ��
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	private String str;
	private double db;
	private char ch;
	private boolean b;
	
	// ��Ŭ�� -> Source -> getters and setters -> all select -> generate
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public double getDb() {
		return db;
	}
	public void setDb(double db) {
		this.db = db;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	
}
