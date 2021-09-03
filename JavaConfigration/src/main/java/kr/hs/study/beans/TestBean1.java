package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의기본생성자");
}
	public void init() {
		System.out.println("init method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}
}
