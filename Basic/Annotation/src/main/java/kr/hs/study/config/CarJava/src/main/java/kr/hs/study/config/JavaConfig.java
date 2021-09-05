package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.HyunDai;

@Configuration
public class JavaConfig {
	
	public Car c0() {
		Car c0 = new Car(50);
		return c0;
	}
	
	@Bean(name="c1")
	public HyunDai c1() {
		HyunDai c1 = new HyunDai(c0(), "�ƹݶ�3", "�ϴû�");
		return c1;
	}
	
	@Bean(name="c2")
	public HyunDai c2() {
		HyunDai c2 = new HyunDai("�ƹݶ�4", "ȸ��", new Car(8080));
		return c2;
	}

}
