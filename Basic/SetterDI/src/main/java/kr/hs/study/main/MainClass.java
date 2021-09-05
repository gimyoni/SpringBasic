package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;


public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		/*
		 * TestBean1 t1=ctx.getBean("obj1",TestBean1.class);
		 * System.out.println("t1:"+t1);
		 * 
		 * TestBean1 t2=ctx.getBean("obj1",TestBean1.class);
		 * System.out.println("t2:"+t2);
		 */
		
		System.out.println("=========================");
		TestBean3 t3=ctx.getBean("obj4",TestBean3.class);
		System.out.println("t3:"+t3);
		System.out.println("t3.data3:"+t3.getData3());
		System.out.println("t3.data4:"+t3.getData4());
		System.out.println("t3.data5:"+t3.getData5());
		System.out.println("=========================");
		
		TestBean3 t4=ctx.getBean("obj5",TestBean3.class);
		System.out.println("t4:"+t4);
		System.out.println("t4.data3:"+t4.getData3());
		System.out.println("t4.data4:"+t4.getData4());
		System.out.println("t4.data5:"+t4.getData5());
		ctx.close();

	}

}
