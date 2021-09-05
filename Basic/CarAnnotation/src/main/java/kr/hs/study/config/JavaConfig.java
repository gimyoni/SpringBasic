package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.HyunDai;

@Configuration
public class JavaConfig {
	
	@Bean
	public HyunDai car2() {
		HyunDai car2 = new HyunDai(new Car(), "두번째", "두번째");
		return car2;
	}

}