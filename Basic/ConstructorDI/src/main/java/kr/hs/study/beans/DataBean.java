package kr.hs.study.beans;

public class DataBean {
	private int a;
	private int b;
	
	public DataBean() {
		System.out.println("DataBean의 기본생성자");
	}
	
	public void prData() {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
