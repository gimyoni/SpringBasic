package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;
import kr.hs.study.config.JavaConfig;

public class Main {
	public static void main(String args[]) {		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		// autowire 사용
		HyunDai car1 = ctx.getBean("c1", HyunDai.class);
		car1.order();
		
		System.out.println("-----------------------");
		
		// 일반 java 주입 사용
		HyunDai car2 = ctx.getBean("c2", HyunDai.class);
		car2.order();
		
		ctx.close();
	} 
}