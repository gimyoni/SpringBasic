package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
private int a;
private String b;

@Autowired
private DataBean3 c;
/*  component scan시 autowired가 있으면 자동주입을 시킨다. 
 * DataBean3  bean이 등록되어 있으면 주소값을 c에 대입한다. */

@Autowired
private DataBean4 d;
public int getA() {
	return a;
}
public String getB() {
	return b;
}
public DataBean3 getC() {
	return c;
}
public DataBean4 getD() {
	return d;
}


}
