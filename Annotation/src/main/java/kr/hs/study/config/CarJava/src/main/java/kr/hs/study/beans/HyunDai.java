package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class HyunDai extends Car{
	private String name;
	private String color;
	private Car car;
	
	public HyunDai() {
		
	}

	public HyunDai(Car car, String name, String color) {
		super();
		this.car = car;
		this.name = name;
		this.color = color;
	}
	
	@Autowired
	public HyunDai(@Value("아반떼3") String name, @Value("흰색") String color, Car car) {
		super();
		this.name = name;
		this.color = color;
		this.car = car;
	}

	@Override
	public void order() {
		System.out.println("가격 : " + car.getMoney());
		System.out.println(name + " 주문하다");
		System.out.println("이름 : " + this.name);
		System.out.println("색상 : " + this.color);
	}
}
