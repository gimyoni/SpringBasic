package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// autowire ���
		HyunDai car1 = ctx.getBean("car1", HyunDai.class);
		car1.order();
		
		System.out.println("---------------------------");
		
		// xml �Ϲ� ���� ���
		HyunDai car2 = ctx.getBean("car2", HyunDai.class);
		car2.order();
	}
}