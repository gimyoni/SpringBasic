package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;
import kr.hs.study.config.JavaConfig;

public class Main {
	public static void main(String args[]) {		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HyunDai car1 = ctx.getBean("car1", HyunDai.class);
		System.out.println("car1 : " + car1);		
		System.out.println("----------------------------------------");
		
		ctx.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		HyunDai car2 = ctx2.getBean("car2", HyunDai.class);
		System.out.println("car2 : " + car2);
		car2.order();
		System.out.println("----------------------------------------");
		
		HyunDai car3 = ctx2.getBean(HyunDai.class);
		System.out.println("car3 : " + car3);
		car3.order();
		
		ctx.close();
	} 
}