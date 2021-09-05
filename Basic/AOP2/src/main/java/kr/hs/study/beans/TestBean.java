package kr.hs.study.beans;

public class TestBean {
	public void add() {
		System.out.println("add메서드 호출");
	}
	public int abs() {
		System.out.println("abs메서드 호출");
		return 100;
	}
	public void sub() {
		System.out.println("sub메서드 호출");
	}
	public void ex() {
		int a=10/0;
	}

}
