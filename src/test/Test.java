package test;

public class Test {
	// 데이터 저장 형태를 만들어 놓은 클래스
	// private 을 이용하여 데이터를 직접 관리하지 못함
	// public, protected, default(아무것도 안쓰는것), private
	private int num;
	
	// 값을 반환하는 메서드, 매개변수로 값을 저장하는 메서드
	// getter, setter 라고 함
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
	
	// 우클릭 -> Source -> getters and setters -> all select -> generate
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
