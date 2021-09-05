package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HyunDai extends Car{
	private String name;
	private String color;
	private Car car;
	
	public HyunDai() {
		
	}

	@Autowired
	public HyunDai(Car car, @Value("그냥이름") String name, @Value("그냥색깔") String color) {
		super();
		this.car = car;
		this.name = name;
		this.color = color;
	}

	@Override
	public void order() {
		System.out.println("가격 : " + car.getMoney());
		System.out.println(name + " 주문하다");
		System.out.println("이름 : " + this.name);
		System.out.println("색상 : " + this.color);
	}
}
