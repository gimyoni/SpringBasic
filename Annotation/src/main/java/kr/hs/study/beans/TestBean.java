package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean {
public TestBean() {
	System.out.println("TestBean의 기본생성자");
}

@PostConstruct
 public void init() {
	 System.out.println("init method");
 }
 
 @PreDestroy
public void destroy() {
	 System.out.println("destroy method");
}

}
