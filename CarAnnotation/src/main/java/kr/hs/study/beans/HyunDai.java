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
	public HyunDai(Car car, @Value("�׳��̸�") String name, @Value("�׳ɻ���") String color) {
		super();
		this.car = car;
		this.name = name;
		this.color = color;
	}

	@Override
	public void order() {
		System.out.println("���� : " + car.getMoney());
		System.out.println(name + " �ֹ��ϴ�");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.color);
	}
}
