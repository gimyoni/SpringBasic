package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
public class JavaConfig {
	/* <bean id="obj1" class="kr.hs.study.beans.TestBean1"/> */
	@Bean
	public TestBean2 t1() {
		TestBean2 t2=new TestBean2(10,"spring1",new DataBean2());
		return t2;
	}
	
	@Bean
	public TestBean2 t2() {
		TestBean2 t3=new TestBean2();
		t3.setA(300);
		t3.setB("spring3");
		t3.setC(new DataBean2());
		return t3;
	}
	
}
