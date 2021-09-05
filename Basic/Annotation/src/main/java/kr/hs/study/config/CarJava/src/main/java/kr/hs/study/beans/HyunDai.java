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
	public HyunDai(@Value("�ƹݶ�3") String name, @Value("���") String color, Car car) {
		super();
		this.name = name;
		this.color = color;
		this.car = car;
	}

	@Override
	public void order() {
		System.out.println("���� : " + car.getMoney());
		System.out.println(name + " �ֹ��ϴ�");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.color);
	}
}
