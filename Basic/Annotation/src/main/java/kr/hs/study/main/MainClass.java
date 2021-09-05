package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;


public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
	   //TestBean2 가지고 오기
		//a,b,c,d, 출력  0, null,null,null
		TestBean2 t2=ctx1.getBean(TestBean2.class);
		System.out.println("t2.a:"+t2.getA());
		System.out.println("t2.b:"+t2.getB());
		System.out.println("t2.c:"+t2.getC());
		System.out.println("t2.d:"+t2.getD());
		
		System.out.println("-------------------------------");
		TestBean3 t3=ctx1.getBean(TestBean3.class);
		System.out.println("t3.data1:"+t3.getData1());
		System.out.println("t3.data2:"+t3.getData2());
		System.out.println("t3.data3:"+t3.getData3());
		System.out.println("t3.data4:"+t3.getData4());
		ctx1.close();
		
		System.out.println("===================================================");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
		   TestBean3 t5=ctx2.getBean("java1",TestBean3.class);
		   System.out.println("t5.data1:"+t5.getData1());
			System.out.println("t5.data2:"+t5.getData2());
			System.out.println("t5.data3:"+t5.getData3());
			System.out.println("t5.data4:"+t5.getData4());
		ctx2.close();

		
		
		

	}

}
