package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
	// 컨테이너의 설정파일을 읽어오고 객체생성해서  IOC  컨테이너에 보관
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		Test t2=ctx.getBean("t2",TestBean2.class);
		System.out.println("t2:"+t2);
	
		ctx.close();

	}

}
