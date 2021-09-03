package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;


public class MainClass {

	public static void main(String[] args) {

	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

	
	  TestBean1 obj1=ctx.getBean("t1",TestBean1.class);
	  System.out.println("obj1:"+obj1);
	  System.out.println("obj1.data1:"+obj1.getData1());
	  System.out.println("obj1.data2:"+obj1.getData2());
	  
	  System.out.println("===================================");
	  TestBean1 obj2=ctx.getBean("t2",TestBean1.class);
	  System.out.println("obj2:"+obj2);
	  System.out.println("obj2.data1:"+obj2.getData1());
	  System.out.println("obj2.data2:"+obj2.getData2());
	 
	
	ctx.close();

}
	
}
