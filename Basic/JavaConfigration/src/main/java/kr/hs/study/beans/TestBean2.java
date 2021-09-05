package kr.hs.study.beans;

public class TestBean2 {
private int a;
private String b;
private DataBean2 c;
public TestBean2() {
	// TODO Auto-generated constructor stub
}
public TestBean2(int a, String b, DataBean2 c) {

	this.a = a;
	this.b = b;
	this.c = c;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public String getB() {
	return b;
}

public void setB(String b) {
	this.b = b;
}

public DataBean2 getC() {
	return c;
}

public void setC(DataBean2 c) {
	this.c = c;
}


}
